package pomawies.aoc22kt.days.framework

abstract class CsvDay<A, B> : IDay<List<A>, List<B>>() {
    final override fun convertOne(lines: List<String>): List<A> {
        return lines
            .map { line -> line.split(sepChar()) }
            .map { columns -> parseOne(columns) }
            .toList()
    }

    override fun convertTwo(lines: List<String>): List<B> {
        return lines.map { line -> line.split(sepChar()) }
            .map { columns -> parseTwo(columns) }
            .toList()
    }

    abstract fun sepChar(): String

    abstract fun parseOne(line: List<String>): A
    abstract fun parseTwo(line: List<String>): B
}