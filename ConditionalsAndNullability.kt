fun main() {
    demonstrateIfElse(trafficLightColor = "Red")
    demonstrateIfElse(trafficLightColor = "Green")
    
    demonstrateWhenExpression(trafficLightColor = "Yellow")
    demonstrateWhenExpression(trafficLightColor = "Blue")
    
    demonstrateNullability()
}

fun demonstrateIfElse(trafficLightColor: String) {
    if (trafficLightColor == "Red") {
        println("Stop!")
    } else if (trafficLightColor == "Yellow") {
        println("Slow down!")
    } else if (trafficLightColor == "Green") {
        println("Go!")
    } else {
        println("Invalid traffic light color.")
    }
}

fun demonstrateWhenExpression(trafficLightColor: String) {
    val action = when (trafficLightColor) {
        "Red" -> "Stop immediately!"
        "Yellow" -> "Caution!"
        "Green" -> "Proceed safely!"
        else -> "Unknown signal state."
    }
    println("Signal action: $action")
}

fun demonstrateNullability() {
    var favoriteActor: String? = "Sandra Bullock"
    println("Actor length: ${favoriteActor?.length}")
    
    favoriteActor = null
    val length = favoriteActor?.length ?: 0
    println("Actor length when null: $length")
}
