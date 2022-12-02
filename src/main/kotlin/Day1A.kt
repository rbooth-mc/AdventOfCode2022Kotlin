import java.io.File

class Day1A {
    fun findMaxSum() {
        val fileName = "src/main/resources/day-1-input.txt"

        val reader = File(fileName).bufferedReader()
        var maxSum = 0
        var currentSum = 0
        while (reader.ready()) {
            val currentLine = reader.readLine()
            if (currentLine.isBlank()) {
                maxSum = if (currentSum > maxSum) currentSum else maxSum
                currentSum = 0
            } else {
                currentSum += currentLine.toInt()
            }
        }
        println("Max sum: $maxSum")
    }
}
