package me.kylo.second

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b

    fun getMnemonic(color: Color) =
        when (color) {
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
            Color.BLUE -> "Battle"
            Color.INDIGO -> "In"
            Color.VIOLET -> "Van"
        }

    fun getWarmth(color: Color) =
        when (color) {
            RED, ORANGE, YELLOW -> "warm"
            GREEN -> "natural"
            BLUE, INDIGO, VIOLET -> "cold"
        }

    fun mix(firstColor: Color, secondColor: Color) =
        when (setOf(firstColor, secondColor)) {
            setOf(RED,YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            setOf(RED, BLUE) -> VIOLET
            else -> throw Exception("Dirty Color")
        }
}