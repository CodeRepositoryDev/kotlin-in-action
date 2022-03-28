package me.kylo.second

fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    println("${name}님! 반가워요!")

    if (args.isNotEmpty()) {
        println("Hello, ${args[0]}!")
    }

    println("Hello, ${if (args.isNotEmpty()) args[0] else "SomeBodyHelpMe"}!")
}