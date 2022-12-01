package pomawies.aoc22kt.days.framework

abstract class StringListTask(day: Int, part: Int) : AbstractTask<List<String>>(day, part) {
    final override fun convertInput(lines: List<String>): List<String> {
        return lines
    }
}