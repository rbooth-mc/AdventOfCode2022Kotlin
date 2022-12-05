fun main(args: Array<String>) {
//    println(
//        File("src/main/resources/day-1-input.txt")
//            .readText(Charsets.UTF_8)
//            .split(Regex("\n\n"))
//            .maxOfOrNull {
//                it.lines().sumOf {
//                        line -> line.toInt()
//                }
//            }
//    )
//    val day1a = Day1A()
//    day1a.findMaxSum()
//
//    Day1B().findSumOfTopThree()
//    Day2A().getTotalScore()
//    Day2B().getTotalScore()
//    println(Day3A(InputFileReader("src/main/resources/day-3-input.txt").reader()).getPrioritySum())

    println(Day3B(InputFileReader("src/main/resources/day-3-input.txt").reader()).getPrioritySum())
}
