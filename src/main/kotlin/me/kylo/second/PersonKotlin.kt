package me.kylo.second

class PersonKotlin(
    val name: String,
    var isMarried: Boolean
)

fun main(args: Array<String>) {
    val person = PersonKotlin("Kylo", false)
    println(person.name)
    println(person.isMarried)

    person.isMarried = true
}