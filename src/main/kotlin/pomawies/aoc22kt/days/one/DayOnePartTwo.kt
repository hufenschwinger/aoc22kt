package pomawies.aoc22kt.days.one

import pomawies.aoc22kt.days.framework.AbstractTask

class DayOnePartTwo : AbstractTask(1, 2, "D1") {
    override fun solve(): Long {
        return parseBags(lines)
            .stream()
            .map(ElfBag::getSum)
            .sorted(Comparator.comparing<Long?, Long?> { a -> a }.reversed())
            .limit(3)
            .mapToLong(Long::toLong)
            .sum()
    }
}