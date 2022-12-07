private val days = listOf(
    aoc2015.Day01,
    aoc2015.Day02,
    aoc2015.Day03,
    aoc2015.Day04,
    aoc2015.Day05,
    aoc2015.Day06,
    aoc2015.Day07,
    aoc2015.Day08,
    aoc2015.Day09,
    aoc2015.Day10,

    aoc2022.Day01,
    aoc2022.Day02,
    aoc2022.Day03,
    aoc2022.Day04,
    aoc2022.Day05,
    aoc2022.Day06,
    aoc2022.Day07,
)

fun main() = days.forEach(AoCDay<*>::printAnswers)
