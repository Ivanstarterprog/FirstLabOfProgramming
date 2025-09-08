fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("При запуске программы необходимо указать аргументы")
        return
    }
    val sortedArgs = args.sorted()
    for (word in sortedArgs){
        println(word)
    }
}