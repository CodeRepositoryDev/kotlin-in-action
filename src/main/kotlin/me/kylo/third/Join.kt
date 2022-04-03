// @JvmName 어노테이션은 파일의 맨앞, 패키지 선언부 위에 와야한다.
// java 파일로 컴파일 될 때, 클래스이름을 설정할 수 있다.
@file:JvmName("StringFunctions")

package strings

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

fun String.lastChar(): Char = get(length - 1)

fun <T> Collection<T>.joinToStringV2(
    separator: String = ", ",
    prefix: String = "",
    suffix: String = "."
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) {
            result.append(separator)
        }
        result.append(element)
    }
    return result.append(suffix).toString()
}

fun Collection<String>.join(separator: String, prefix: String, suffix: String) =
    joinToStringV2(separator, prefix, suffix)

open class View {
    open fun click() = println("View Clicked!")
}

class Button : View() {
    override fun click() = println("Button Clicked!")
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

fun main(args: Array<String>) {
    val view: View = Button()
    view.click()
    view.showOff()
    val strings: List<String> = listOf("first", "second", "fourteen")
    strings.last()
    val numbers: Collection<Int> = setOf(1, 14, 2)
    numbers.maxOrNull()

    val result = StringBuilder()
    for(s in 'a'..'z'){
        result.append(s).append(",")
    }

    println(result.toString())

    result.split(",",".")

}