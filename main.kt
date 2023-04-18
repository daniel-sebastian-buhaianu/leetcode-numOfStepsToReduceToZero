fun main() {
    println(numberOfSteps(8))
}

fun numberOfSteps(num: Int): Int {
    var steps = 0
    var tmp = num
    while (tmp != 0) {
        if (tmp % 2 == 0) {
            tmp = tmp / 2
        } else {
            tmp = tmp - 1
        }
        steps++
    }
    return steps
}