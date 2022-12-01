package pomawies.aoc22kt.days.framework

import java.nio.file.Files
import java.nio.file.Path

private const val rscRoot = "src/main/resources/"

private fun readInput(fileName: String): List<String> {
    return Files.readAllLines(
        Path.of(rscRoot)
            .resolve("$fileName.txt")
    )
}

abstract class AbstractTask(private val day: Int, private val part: Int, private val fileName: String) {

    fun getSolution(): Long {
        return solve(
            readInput(fileName)
        )
    }

    fun dayNumber(): Int {
        return day
    }

    fun partNumber(): Int {
        return part
    }
    protected abstract fun solve(input: List<String>): Long
}