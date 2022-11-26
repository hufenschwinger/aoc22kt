package pomawies.aoc22kt.days

import java.nio.file.Files
import java.nio.file.Path

private const val srcRoot = "src/main/resources/"

abstract class IDay<T> {
    private fun getInput(part: Int): List<String> {
        return Files.readAllLines(
            Path.of(srcRoot)
                .resolve(
                    String.format(
                        "D%dP%d.txt",
                        number(),
                        part
                    )
                )
        )
    }

    protected fun inputOne(): T {
        return convert(getInput(1))
    }

    protected fun inputTwo(): T {
        return convert(getInput(2))
    }

    abstract fun convert(lines: List<String>): T

    abstract fun number(): Int
    abstract fun partOne(): Long
    abstract fun partTwo(): Long
}