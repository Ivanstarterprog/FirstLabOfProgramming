fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("При запуске программы необходимо указать аргументы")
        return
    }
    val sortedArgs = args.sorted()
    val argsWithoutReapetedWords = sortedArgs.distinct()
    for (word in argsWithoutReapetedWords){
        println(word)
    }
}