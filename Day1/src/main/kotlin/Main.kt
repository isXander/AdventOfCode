fun main() {
    val input = {}.javaClass.getResource("/input.txt")!!
        .readText()
        .split('\n')
        .map { it.trim().toInt() }

    println("Part 1: ${part1(input)}")
    println("Part 2: ${part2(input)}")
}

fun part1(input: List<Int>): Int {
    var i = 0
    var previous: Int? = null
    for (current in input) {
        if (previous == null) {
            previous = current
            continue
        }

        if (current > previous) {
            i++
        }

        previous = current
    }

    return i
}

fun part2(input: List<Int>): Int {
    val sumList = mutableListOf<Int>()

    // generate sum of parts
    for (i in input.indices) {
        if (i > input.size - 3) {
            break
        }

        sumList.add(input.subList(i, i + 3).sum())
    }

    return part1(sumList)
}