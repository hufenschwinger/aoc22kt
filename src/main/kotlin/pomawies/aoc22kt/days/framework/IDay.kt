package pomawies.aoc22kt.days.framework

import java.nio.file.Files
import java.nio.file.Path

private const val rscRoot = "src/main/resources/"

abstract class IDay<A, B> {
    fun getOne(): Long {
        return partOne(inputOne())
    }

    fun getTwo(): Long {
        return partTwo(inputTwo())
    }

    private fun getInput(part: Int): List<String> {
        return Files.readAllLines(
            Path.of(rscRoot)
                .resolve(
                    String.format(
                        "D%dP%d.txt",
                        number(),
                        part
                    )
                )
        )
    }
    private fun inputOne(): A {
        return convertOne(getInput(1))
    }
    protected abstract fun convertOne(lines: List<String>): A
    private fun inputTwo(): B {
        return convertTwo(getInput(2))
    }
    protected abstract fun convertTwo(lines: List<String>): B
    abstract fun number(): Int
    protected abstract fun partOne(input: A): Long
    protected abstract fun partTwo(input: B): Long
}