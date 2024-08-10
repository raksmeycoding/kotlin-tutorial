package org.example.utils


fun main() {


    val sum = calculate(1, 2) { a, b -> a + b }
    println("Result of sum: $sum")

}


fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y);
}


fun sum(x: Int, y: Int) = x + y;