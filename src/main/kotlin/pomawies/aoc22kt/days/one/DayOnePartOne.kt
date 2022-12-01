package pomawies.aoc22kt.days.one

import pomawies.aoc22kt.days.framework.AbstractTask

class DayOnePartOne : AbstractTask(1, 1, "D1") {
    override fun solve(input: List<String>): Long {
        return parseBags(input)
            .stream()
            .mapToLong { bag -> bag.getSum() }
            .max()
            .asLong
    }
}

