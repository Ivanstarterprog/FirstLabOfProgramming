fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("При запуске программы необходимо указать аргументы")
        return
    }
    val sortedArgs = args.sorted()
    val groupedArgs = sortedArgs.groupingBy { it }.eachCount()
    for (word in groupedArgs){
        println("${word.key} ${word.value}")
    }
}