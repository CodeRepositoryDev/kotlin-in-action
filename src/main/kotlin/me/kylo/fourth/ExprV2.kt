package me.kylo.fourth

sealed class ExprV2 {
    class Num(val value: Int): ExprV2()
    class Sum(val left: ExprV2, val right: ExprV2): ExprV2()
}

fun eval(e: ExprV2) : Int =
    when(e){
        is ExprV2.Num -> e.value
        is ExprV2.Sum -> eval(e.left) + eval(e.right)
    }