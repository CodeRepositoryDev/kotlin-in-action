package me.kylo.third

val set = hashSetOf(1, 7, 53)
val list = arrayListOf(1, 7, 53)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

fun getLast() {
    val strings = listOf("first", "second", "third", "fourteenth")
    println(strings.last())
}

fun getMax() {
    val numbers = setOf(1, 7, 53)
    println(numbers.maxOrNull())
}

// 코틀린 컴파일러가 자동으로 파라미터를 하나씩 생략한 오버로딩한 자바 메소드를 생성한다.
// 파라미터를 하나씩 생략할 때, 코틀린 함수 선언부의 디폴트 값을 사용한다.
@JvmOverloads
fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    suffix: String = "."
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) {
            result.append(separator)
        }
        result.append(element)
    }
    return result.append(suffix).toString()
}