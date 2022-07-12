package me.kylo.fourth

class User(val nickname: String, val isSubscribed: Boolean = true)

class UserV2 constructor(_nickname: String) {
    private val nickname: String

    init {
        nickname = _nickname
    }
}

class UserV3(_nickname: String) {
    val nickname = _nickname
}

fun main(args: Array<String>) {
    val kylo = User("kylo")
    println(kylo.isSubscribed)

    val rose = User("rose", false)
    println(rose.isSubscribed)
}