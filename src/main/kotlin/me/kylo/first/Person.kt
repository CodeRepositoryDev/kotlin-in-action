package me.kylo.first

data class Person(
    val name: String,
    val age: Int? = null
)

fun main(args: Array<String>) {
    val persons = listOf(
        Person("kylo", 31),
        Person("ethan"),
        Person("coco", 28)
    )

    val oldest = persons.maxByOrNull { it.age ?: 0 }
    println("나이가 가장 많은 사람은? $oldest")
}

fun findAlice() = findPerson { it.name == "alice"}
fun findBob() = findPerson { it.name == "bob"}

fun findPerson(filterFunction: (person: Person) -> Boolean): Person {
    val persons = listOf(
        Person("kylo", 31),
        Person("ethan"),
        Person("coco", 28),
        Person("bob", 38),
        Person("alice", 24)
    )
    return persons.first { filterFunction(it) }
}
