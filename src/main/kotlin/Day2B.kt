import java.io.File

class Day2B {
    fun getTotalScore() {
        val resultMap = mapOf("A X" to 3, "A Y" to 4, "A Z" to 8, "B X" to 1, "B Y" to 5, "B Z" to 9, "C X" to 2, "C Y" to 6, "C Z" to 7)
        val fileName = "src/main/resources/day-2-input.txt"
        val reader = File(fileName).bufferedReader()
        var currentScore = 0
        while (reader.ready()) {
            val currentLine = reader.readLine()
            currentScore += resultMap[currentLine]!!
        }
        println("Total Score: $currentScore")
    }
}
