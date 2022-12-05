import java.io.BufferedReader

class Day4B(private var inputReader: BufferedReader) {
    fun getOverlapSum(): Int {
        var overlapCounter = 0
        while (inputReader.ready()) {
            val line = inputReader.readLine()
            val rangeEndpoints = line.split(Regex("[,-]"))
            val range1 = rangeEndpoints[0].toInt()..rangeEndpoints[1].toInt()
            val range2 = rangeEndpoints[2].toInt()..rangeEndpoints[3].toInt()
            overlapCounter += if (range1.any { it in range2 } || range2.any { it in range1 }) 1 else 0
        }
        return overlapCounter
    }
}
