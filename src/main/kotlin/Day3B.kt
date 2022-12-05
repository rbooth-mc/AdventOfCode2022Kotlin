import java.io.BufferedReader

class Day3B(private var inputReader: BufferedReader) {
    private val UPPERCASE_CONVERSION = 38
    private val LOWERCASE_CONVERSION = 96
    fun getPrioritySum(): Int {
        var prioritySum = 0
        while (inputReader.ready()) {
            val member1 = inputReader.readLine().toList().distinct().toSet()
            val member2 = inputReader.readLine().toList().distinct().toSet()
            val member3 = inputReader.readLine().toList().distinct().toSet()
            val intersections = member1.intersect(member2.intersect(member3))

            for (priority in intersections) {
                prioritySum += priority.code - (if (priority.isLowerCase()) LOWERCASE_CONVERSION else UPPERCASE_CONVERSION)
            }
        }
        return prioritySum
    }
}
