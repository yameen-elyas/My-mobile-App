open class SmartDevice(val name: String, val category: String) {
    var deviceStatus = "online"
        protected set

    open var deviceTurnOnCount = 0

    open fun turnOn() {
        deviceStatus = "on"
        deviceTurnOnCount++
        println("$name ($category) is turned ON. Total turn-ons: $deviceTurnOnCount")
    }

    open fun turnOff() {
        deviceStatus = "off"
        println("$name ($category) is turned OFF.")
    }
}

class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(deviceName, deviceCategory) {

    var speakerVolume = 10
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    var channelNumber = 1
        set(value) {
            if (value in 1..200) {
                field = value
            }
        }

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel changed to $channelNumber.")
    }
}

fun main() {
    val myTv = SmartTvDevice("Living Room TV", "Entertainment")
    myTv.turnOn()
    myTv.increaseSpeakerVolume()
    myTv.nextChannel()
    myTv.turnOff()
}
