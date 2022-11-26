package pomawies.aoc22kt.days.framework

abstract class StringListDay : IDay<List<String>>() {
    final override fun convert(lines: List<String>): List<String> {
        return lines
    }
}