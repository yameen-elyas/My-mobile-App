fun main() {
    val trick = { println("No treat!") }
    val treat: () -> Unit = { println("Have a treat!") }

    playGame(isTrick = true, trick)
    playGame(isTrick = false, treat)

    val coins: (Int) -> String = { quantity -> "$quantity quarters" }
    val cupcake: (Int) -> String = { "Have a cupcake!" }

    println(trickOrTreat(false, coins))
    println(trickOrTreat(true, null))
    println(trickOrTreat(false, cupcake))
}

fun playGame(isTrick: Boolean, extraAction: () -> Unit) {
    if (isTrick) {
        extraAction()
    } else {
        println("Regular play session.")
        extraAction()
    }
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): String {
    if (isTrick) {
        return "No treat!"
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return "Have a treat!"
    }
}
