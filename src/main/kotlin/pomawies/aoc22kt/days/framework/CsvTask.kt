package pomawies.aoc22kt.days.framework

abstract class CsvTask<T> : AbstractTask<List<T>>() {
    override fun convertInput(lines: List<String>): List<T> {
        return lines
            .map { line -> line.split(sepChar()) }
            .map { columns -> parseOne(columns) }
            .toList()
    }

    protected abstract fun sepChar(): String
    protected abstract fun parseOne(line: List<String>): T
}