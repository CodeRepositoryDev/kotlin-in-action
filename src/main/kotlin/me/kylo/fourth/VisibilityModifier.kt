package me.kylo.fourth

internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}


//fun TalkativeButton.giveSpeech() { //<- public 멤버가 internal 인 TalkativeButton 을 노출함.
//    yell() // <- TalkativeButton 의 private 멤버여서 접근불가
//    whisper() // <- TalkativeButton 의 protected 멤버여서 접근불가
//}