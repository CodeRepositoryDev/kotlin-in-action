package me.kylo.second

fun main(args: Array<String>) {
    println("Hello, Kotlin World!")
}

fun max(a: Int, b: Int) = if (a > b) a else b

val question = "삶, 우주, 그리고 모든 것에 대한 궁극적인 질문"
val answer: Int = 42
val yearsToCompute = 7.5e6
fun canPerformOperation(): Boolean {
    val answer2: Int
    answer2 = 42

    return true
}

fun initValue() {
    val message: String
    if (canPerformOperation()) {
        message = "Success"
    } else {
        message = "Failed"
    }

    val languages = arrayListOf("Java")
    languages.add("Kotlin")

//    실패 케이스 ( Type mismatch)
//    var answer = 42
//    answer = "no answer"

}