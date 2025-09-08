fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("При запуске программы необходимо указать аргументы")
        return
    }
    args.groupingBy { it }
        .eachCount()
        .toList()
        .sortedWith (
            compareByDescending<Pair<String, Int>> { it.second }
            .thenBy { it.first }
        )
        .forEach { ( key, value ) ->
            println("$key $value")
        }

}