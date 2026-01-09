fun main(args: Array<String>) {
    countAndSortArgs(readInput(args))
}

fun readInput(args: Array<String>): List<String>{
    return if (args.isEmpty()) {
        readLine()?.split(" ")?.filter { it.isNotBlank() } ?: emptyList()
    } else {
        args.toList()
    }
}

fun countAndSortArgs(words: List<String>){
    words.sorted()
        .groupingBy { it }
        .eachCount()
        .toList()
        .sortedByDescending { it.second }
        .forEach { (key, value) ->
            println("$key $value")
        }
}