fun main() {
    exercisePrintMessages()
    exerciseFixCompileError()
    exerciseStringTemplates()
    exerciseStringConcatenation()
    exerciseMathOperations()
    exerciseDefaultParameters()
    exerciseRefactorDuplicateCode()
}

fun exercisePrintMessages() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When a program runs, the variables are updated as needed.")
}

fun exerciseFixCompileError() {
    val city = "New York"
    val temperature = 22
    println("The temperature in $city is $temperature degrees Celsius.")
}

fun exerciseStringTemplates() {
    val numberOfPhotos = 100
    val numberOfDeletedPhotos = 10
    println("$numberOfPhotos photos in total.")
    println("$numberOfDeletedPhotos photos deleted.")
    println("${numberOfPhotos - numberOfDeletedPhotos} photos remaining.")
}

fun exerciseStringConcatenation() {
    val numberOfNotifications = 5
    val notificationPrefix = "You have "
    val notificationSuffix = " new notifications."
    println(notificationPrefix + numberOfNotifications + notificationSuffix)
}

fun exerciseMathOperations() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    val result = addNumbers(firstNumber, secondNumber)
    val anotherResult = addNumbers(firstNumber, thirdNumber)
    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

fun addNumbers(first: Int, second: Int): Int {
    return first + second
}

fun exerciseDefaultParameters() {
    displayEmailDetails(sender = "support@android.com", recipient = "user@example.com")
    displayEmailDetails(sender = "alerts@android.com", recipient = "user@example.com", subject = "Security Alert")
}

fun displayEmailDetails(sender: String, recipient: String, subject: String = "No Subject") {
    println("Sender: $sender | Recipient: $recipient | Subject: $subject")
}

fun exerciseRefactorDuplicateCode() {
    printWeatherReport("City A", 20, 25, 80)
    printWeatherReport("City B", 15, 18, 65)
    printWeatherReport("City C", 30, 35, 40)
}

fun printWeatherReport(city: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    println("City: $city")
    println("Low: $lowTemp, High: $highTemp")
    println("Chance of rain: $chanceOfRain%")
    println()
}
