fun main() {
    val courseName = "Android Basics with Compose"
    val unitNumber = 1
    val pathwayNumber = 1
    println("Course: $courseName")
    println("Unit $unitNumber, Pathway $pathwayNumber")

    val totalCount = 10
    val completedCount = 4
    println("Progress: $completedCount / $totalCount completed")
    println("Remaining: ${totalCount - completedCount} activities")

    var stepNumber = 1
    println("Current Step: $stepNumber")
    stepNumber = 2
    println("Updated Step: $stepNumber")
}
