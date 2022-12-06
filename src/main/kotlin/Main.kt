private val days = listOf(
    aoc2015.Day1,
    aoc2015.Day2,
    aoc2015.Day3,
    aoc2015.Day4,
    aoc2015.Day5,

    aoc2022.Day1,
    aoc2022.Day2,
    aoc2022.Day3,
    aoc2022.Day4,
    aoc2022.Day5,
)

fun main() = days.forEach(AoCDay<*>::printAnswers)
