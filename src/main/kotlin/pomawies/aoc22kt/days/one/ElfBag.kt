package pomawies.aoc22kt.days.one

import java.util.*

fun parseBags(lines: List<String>): List<ElfBag> {
    val bags = LinkedList<ElfBag>()
    var current = LinkedList<String>()

    for (s in lines) {
        if (s.isBlank()) {
            bags.add(ElfBag(current))
            current = LinkedList<String>()
        } else {
            current.add(s)
        }
    }

    return bags
}

class ElfBag(private val numbers: Collection<String>) {
    fun getSum(): Long {
        return numbers
            .stream()
            .mapToLong(String::toLong)
            .sum()
    }
}