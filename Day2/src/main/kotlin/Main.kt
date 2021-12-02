fun main() {
    val input = getResource("/input.txt")

    println("Part 1: ${part1(input)}")
    println("Part 2: ${part2(input)}")
}

fun part1(input: List<String>): Int {
    var horizontal = 0
    var depth = 0

    val instructions = mapOf<String, (Int) -> Unit>(
        "forward" to { horizontal += it },
        "up" to { depth -= it },
        "down" to { depth += it }
    )

    input.forEach {
        val (direction, distance) = it.split(" ")
        instructions[direction]?.invoke(distance.trim().toInt())
    }

    return horizontal * depth
}

fun part2(input: List<String>): Int {
    var horizontal = 0
    var depth = 0
    var aim = 0

    val instructions = mapOf<String, (Int) -> Unit>(
        "up" to { aim -= it },
        "down" to { aim += it },
        "forward" to {
            horizontal += it
            depth += aim * it
        },
    )

    input.forEach {
        val (direction, distance) = it.split(" ")
        instructions[direction]?.invoke(distance.trim().toInt())
    }

    return horizontal * depth
}