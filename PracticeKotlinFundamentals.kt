fun main() {
    problem1MobileNotifications()
    problem2MovieTickets()
    problem3TemperatureConverter()
    problem4SongCatalog()
    problem5InternetProfile()
    problem6FoldablePhone()
    problem7SpecialAuction()
}

fun problem1MobileNotifications() {
    printNotificationSummary(51)
    printNotificationSummary(135)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("You have $numberOfMessages notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}

fun problem2MovieTickets() {
    val child = 5
    val adult = 28
    val senior = 87
    val isMonday = true

    println("The ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when {
        age in 0..12 -> 15
        age in 13..60 -> if (isMonday) 25 else 30
        age in 61..100 -> 20
        else -> -1
    }
}

fun problem3TemperatureConverter() {
    convertTemp(27.0, "Celsius", "Fahrenheit") { celsius -> (9.0 / 5.0) * celsius + 32 }
    convertTemp(350.0, "Kelvin", "Celsius") { kelvin -> kelvin - 273.15 }
    convertTemp(100.0, "Fahrenheit", "Kelvin") { fahrenheit -> (5.0 / 9.0) * (fahrenheit - 32) + 273.15 }
}

fun convertTemp(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

fun problem4SongCatalog() {
    val song = Song("Bohemian Rhapsody", "Queen", 1975, 2500000)
    song.printSongDescription()
    println("Is popular: ${song.isPopular}")
}

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printSongDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}

fun problem5InternetProfile() {
    val amanda = Profile("Amanda", 33, "play tennis", null)
    val atiqah = Profile("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}

class Profile(
    val name: String,
    val age: Int,
    val hobby: String?,
    val referrer: Profile?
) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if (hobby != null) {
            print("Likes to $hobby. ")
        }
        if (referrer != null) {
            print("Has a referrer named ${referrer.name}")
            if (referrer.hobby != null) {
                print(", who likes to ${referrer.hobby}.")
            } else {
                print(".")
            }
        } else {
            print("Has no referrer.")
        }
        println("\n")
    }
}

fun problem6FoldablePhone() {
    val foldablePhone = FoldablePhoneDevice()
    foldablePhone.checkPhoneScreenLight()
    foldablePhone.open()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()
    foldablePhone.close()
    foldablePhone.checkPhoneScreenLight()
}

open class BasicPhone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    open fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneState = if (isScreenLightOn) "on" else "off"
        println("The phone screen light is $phoneState.")
    }
}

class FoldablePhoneDevice(var isFolded: Boolean = true) : BasicPhone() {
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun open() {
        isFolded = false
    }

    fun close() {
        isFolded = true
        isScreenLightOn = false
    }
}

fun problem7SpecialAuction() {
    val winningBid = Bid(5500, "Collector A")
    println("Item A sold for ${auctionPrice(winningBid, 2000)}.")
    println("Item B sold for ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return bid?.amount ?: minimumPrice
}
