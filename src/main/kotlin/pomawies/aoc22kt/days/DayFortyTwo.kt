package pomawies.aoc22kt.days

class DayFortyTwo : IDay() {
    override fun number(): Int {
        return 42
    }

    override fun partOne(): Long {
        return 1L * inputOne().size
    }

    override fun partTwo(): Long {
        return 2L * inputTwo().size
    }
}