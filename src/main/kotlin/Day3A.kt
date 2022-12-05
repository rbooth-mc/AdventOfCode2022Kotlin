import java.io.BufferedReader

class Day3A(private var inputReader: BufferedReader) {
    private val UPPERCASE_CONVERSION = 38
    private val LOWERCASE_CONVERSION = 96
    fun getPrioritySum(): Int {
        var prioritySum = 0
        while (inputReader.ready()) {
            val line = inputReader.readLine()
            val firstHalf = line.subSequence(0, line.length / 2).toList().distinct().toSet()
            val secondHalf = line.subSequence(line.length / 2, line.length).toList().distinct().toSet()
            val intersections = firstHalf.intersect(secondHalf).toCharArray()
            for (priority in intersections) {
                prioritySum += priority.code - (if (priority.isLowerCase()) LOWERCASE_CONVERSION else UPPERCASE_CONVERSION)
            }
        }
        return prioritySum
    }
}
