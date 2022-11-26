import java.time.LocalDateTime

fun execute(day: IDay) {
    val num = day.number()
    val startOne = LocalDateTime.now()
    val one = day.partOne()
    val endOne = LocalDateTime.now()

    val two = day.partTwo()
    String.format(
        "Day %d\npart one %d\npart two\n",
        num,
        one,
        two
    )
}


fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}