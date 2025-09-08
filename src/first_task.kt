//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("При запуске программы необходимо указать аргументы")
        return
    }
    for (word in args){
        println(word)
    }

}