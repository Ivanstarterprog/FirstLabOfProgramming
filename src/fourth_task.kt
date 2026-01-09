fun main(args: Array<String>) {
    args.sorted().groupingBy { it }.eachCount().forEach { (key, value) ->
        println("$key $value")
    }
}
