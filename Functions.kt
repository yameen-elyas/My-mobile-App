fun main() {
    printWelcomeMessage("Android Developer")
    val greeting = createCustomGreeting("Alex", 24)
    println(greeting)
    printUserSummary(name = "Sam", age = 30)
    printUserSummary(name = "Jordan", age = 22, title = "Senior Developer")
}

fun printWelcomeMessage(name: String) {
    println("Welcome to Kotlin programming, $name!")
}

fun createCustomGreeting(name: String, age: Int): String {
    return "Hello $name, happy $age-th birthday!"
}

fun printUserSummary(name: String, age: Int, title: String = "Junior Developer") {
    println("User: $name | Age: $age | Role: $title")
}
