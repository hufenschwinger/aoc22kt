package pomawies.aoc22kt.days.framework

abstract class StringListTask : AbstractTask<List<String>>() {
    final override fun convertInput(lines: List<String>): List<String> {
        return lines
    }
}