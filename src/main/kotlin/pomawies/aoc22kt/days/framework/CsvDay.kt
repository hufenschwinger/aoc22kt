package pomawies.aoc22kt.days.framework

abstract class CsvDay<C> : IDay<List<C>>() {
    final override fun convert(lines: List<String>): List<C> {
        return lines
            .map { line -> line.split(sepChar()) }
            .map { columns -> parse(columns) }
            .toList()
    }

    abstract fun sepChar(): String

    abstract fun parse(line: List<String>): C
}