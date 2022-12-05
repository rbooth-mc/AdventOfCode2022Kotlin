import java.io.BufferedReader

class Day4A(private var inputReader: BufferedReader) {
    fun getContainmentSum(): Int {
        var containmentCounter = 0
        while (inputReader.ready()) {
            val line = inputReader.readLine()
            val rangeEndpoints = line.split(Regex("[,-]"))
            val range1 = rangeEndpoints[0].toInt()..rangeEndpoints[1].toInt()
            val range2 = rangeEndpoints[2].toInt()..rangeEndpoints[3].toInt()
            if (range1.toList().containsAll(range2.toList()) || range2.toList().containsAll(range1.toList())) {
                containmentCounter++
            }
        }
        return containmentCounter
    }
}
