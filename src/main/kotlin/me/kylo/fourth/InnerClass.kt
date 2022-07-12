package me.kylo.fourth

interface State : java.io.Serializable
interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class ButtonClass: View {
    override fun getCurrentState(): State = ButtonState()
    override fun restoreState(state: State) {
        super.restoreState(state)
    }
    class ButtonState: State {
    }
}

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}