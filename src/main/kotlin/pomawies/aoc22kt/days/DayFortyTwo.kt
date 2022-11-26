package pomawies.aoc22kt.days

import pomawies.aoc22kt.days.framework.StringListDay

class DayFortyTwo : StringListDay() {

    override fun number(): Int {
        return 42
    }

    override fun partOne(input: List<String>): Long {
        return 1L * input.size
    }

    override fun partTwo(input: List<String>): Long {
        return 2L * input.size
    }
}