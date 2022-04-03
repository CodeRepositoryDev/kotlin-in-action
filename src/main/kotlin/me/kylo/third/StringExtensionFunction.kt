package me.kylo.third

import java.util.Objects

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir: ${directory}, Name: ${fileName}, ext: ${extension}")
}

fun parsePathV2(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, fileName, extension) = matchResult.destructured
        println("Dir: ${directory}, Name: ${fileName}, ext: ${extension}")
    }
}

fun main(args: Array<String>) {
    parsePath("/Users/kylo/Desktop/Hello.kt")
}