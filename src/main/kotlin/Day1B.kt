import java.io.File

class Day1B {
    fun findSumOfTopThree() {
        val fileName = "src/main/resources/day-1-input.txt"

        val reader = File(fileName).bufferedReader()
        val topThree = mutableListOf(0, 0, 0)
        var currentSum = 0
        while (reader.ready()) {
            val currentLine = reader.readLine()
            if (currentLine.isBlank()) {
                topThree[topThree.indexOf(topThree.min())] = if (topThree.min() < currentSum) currentSum else topThree.min()
                currentSum = 0
            } else {
                currentSum += currentLine.toInt()
            }
        }
        println("Top 3 sum: ${topThree.sum()}")
    }
}
