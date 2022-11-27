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

abstract class AbstractTask<T> {

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

    protected abstract fun convertInput(lines: List<String>): T
    abstract fun dayNumber(): Int
    abstract fun partNumber(): Int
    protected abstract fun solve(input: T): Long
}