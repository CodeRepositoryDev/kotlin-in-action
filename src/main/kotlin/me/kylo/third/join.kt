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