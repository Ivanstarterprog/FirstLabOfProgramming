fun main(args: Array<String>) {
    args.sorted()
        .groupingBy { it }
        .eachCount()
        .toList()
        .sortedByDescending { it.second }
        .forEach { (key, value) ->
            println("$key $value")
        }
}