fun main(args: Array<String>) {
    val inputText: List<String>

    if (args.isEmpty()) {
        inputText = readLine()?.split(" ")?.filter { it.isNotBlank() } ?: emptyList()
    } else {
        inputText = args.toList()
    }
    inputText.groupingBy { it }
        .eachCount()
        .toList()
        .sortedWith(
            compareByDescending<Pair<String, Int>> { it.second }
                .thenBy { it.first }
        )
        .forEach { (key, value) ->
            println("$key $value")
        }
}