package pomawies.aoc22kt

import pomawies.aoc22kt.days.DayFortyTwo
import pomawies.aoc22kt.days.IDay
import java.time.Duration
import java.time.LocalDateTime

fun execute(day: IDay) {
    val num = day.number()

    val startOne = LocalDateTime.now()
    val one = day.partOne()
    val endOne = LocalDateTime.now()
    val durOne = Duration.between(startOne, endOne).toMillis()

    val startTwo = LocalDateTime.now()
    val two = day.partTwo()
    val endTwo = LocalDateTime.now()
    val durTwo = Duration.between(startTwo, endTwo).toMillis()

    println(
        String.format(
            "Day %d\npart one: %d in %d ms\npart two: %d in %d ms\n",
            num,
            one,
            durOne,
            two,
            durTwo
        )
    )
}


fun main() {
    execute(DayFortyTwo())
}