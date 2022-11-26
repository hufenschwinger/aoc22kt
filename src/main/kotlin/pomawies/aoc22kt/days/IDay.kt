package pomawies.aoc22kt.days

import java.nio.file.Files
import java.nio.file.Path

private const val srcRoot = "src/main/resources/"

abstract class IDay {
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

    protected fun inputOne(): List<String> {
        return getInput(1)
    }

    protected fun inputTwo(): List<String> {
        return getInput(2)
    }

    abstract fun number(): Int
    abstract fun partOne(): Long
    abstract fun partTwo(): Long
}