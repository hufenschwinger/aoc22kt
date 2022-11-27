package pomawies.aoc22kt.days

import pomawies.aoc22kt.days.framework.StringListTask

class TaskFortyTwoPartOne : StringListTask() {

    override fun dayNumber(): Int {
        return 42
    }

    override fun partNumber(): Int {
        return 1
    }

    override fun solve(input: List<String>): Long {
        return 7L * input.size
    }
}