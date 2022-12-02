import java.io.File

class Day2A {
    /*
        A = Rock		X = Rock		Rock = 1		Win = 6
        B = Paper		Y = Paper		Paper = 2		Draw = 3
        C = Scissors	Z = Scissors	Scissors = 3	Lose = 0

        A X	=> Rock vs Rock = Draw => 3 + 1 = 4
        A Y => Rock vs Paper = Win => 6 + 2 = 8
        A Z => Rock vs Scissors = Lose => 0 + 3 = 3
        B X => Paper vs Rock = Lose => 0 + 1 = 1
        B Y => Paper vs Paper = Draw => 3 + 2 = 5
        B Z => Paper vs Scissors = Win => 6 + 3 = 9
        C X => Scissors vs Rock = Win => 6 + 1 = 7
        C Y => Scissors vs Paper = Lose => 0 + 2 = 2
        C Z => Scissors vs Scissors = Draw => 3 +3 = 6
     */

    fun getTotalScore() {
        val resultMap = mapOf("A X" to 4, "A Y" to 8, "A Z" to 3, "B X" to 1, "B Y" to 5, "B Z" to 9, "C X" to 7, "C Y" to 2, "C Z" to 6)
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
