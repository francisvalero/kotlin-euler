package euler

import java.time.DayOfWeek
import java.time.Month
import java.time.YearMonth

fun main(args: Array<String>) {

    val r = (1901..2000).asSequence()
            .flatMap { y -> Month.values().map { m -> YearMonth.of( y, m ) }.asSequence() }
            .filter { it.atDay(1).getDayOfWeek().equals(DayOfWeek.SUNDAY) }
            .count()

    println(r)
}