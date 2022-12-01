package pomawies.aoc22kt

import pomawies.aoc22kt.days.one.DayOnePartOne
import pomawies.aoc22kt.days.framework.AbstractTask
import pomawies.aoc22kt.days.one.DayOnePartTwo
import java.time.Duration
import java.time.LocalDateTime

fun execute(day: AbstractTask) {
    val dayNumber = day.dayNumber()
    val partNumber = day.partNumber()

    val start = LocalDateTime.now()
    val solution = day.getSolution()
    val end = LocalDateTime.now()
    val duration = Duration.between(start, end).toMillis()

    println(
        String.format(
            "Day %d\npart %d: %d in %d ms\n",
            dayNumber,
            partNumber,
            solution,
            duration
        )
    )
}

fun main() {
    execute(DayOnePartOne())
    execute(DayOnePartTwo())
}