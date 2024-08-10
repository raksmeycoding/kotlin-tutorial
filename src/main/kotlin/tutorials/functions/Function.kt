package org.example.tutorials.functions


fun main() {

    val name: String = "Kalvin John"
    upperCaseStringLambda(name)

    hello()


    println("==========Lambda Section===============")
    println("Positive value: $positives")
    println("Negative values: $negatives")


    val myName = "raksmey"
    val nameUpperCase = testUpperCase(myName) { str -> str.uppercase() }
    println("My name is uppercase: $nameUpperCase")
}


fun hello() {
    return println("Hello")
}


// Lambda

fun upperCaseString(text: String): String {
    return text.uppercase();
}

var upperCaseStringLambda = { text: String -> text.uppercase() }


// Lambda pass to another function

var number = listOf(1, -2, -3, -4, 5, 6)
val positives = number.filter { n -> n > 0 }

val isNegative = { x: Int -> x < 0 }

val negatives = number.filter(isNegative)

// test
fun testUpperCase(str: String, funUpperCase: (str: String) -> String): String {
    return funUpperCase(str)
}









