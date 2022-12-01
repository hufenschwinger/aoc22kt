package pomawies.aoc22kt.days.framework

import java.nio.file.Files
import java.nio.file.Path

private const val rscRoot = "src/main/resources/"

private fun readInput(dayNumber: Int, partNumber: Int): List<String> {
    return Files.readAllLines(
        Path.of(rscRoot)
            .resolve(
                String.format(
                    "D%dP%d.txt",
                    dayNumber,
                    partNumber
                )
            )
    )
}

abstract class AbstractTask<T>(val day: Int, val part: Int) {

    fun getSolution(): Long {
        return solve(
            loadInput()
        )
    }

    private fun loadInput(): T {
        return convertInput(
            readInput(
                dayNumber(),
                partNumber()
            )
        )
    }

    fun dayNumber(): Int {
        return day
    }

    fun partNumber(): Int {
        return part
    }

    protected abstract fun convertInput(lines: List<String>): T
    protected abstract fun solve(input: T): Long
}