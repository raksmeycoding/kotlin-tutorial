package org.example

import org.example.models.Person

fun main() {
    println("Hello World!");


    val person = Person("Raksmey", 23);

    println(person.name)

    println(person.defaultValue)


    var empty = "test".let {
    }

    createPerson();



}


fun createPerson(): Person {
    return run {
        Person("rak", 18);
    }
}


fun buildGreeting(name: String): String {
    return with(StringBuilder()) {
        append("Hello, ")
        toString()
    }
}


var nameList = listOf("Raksmey", "Chhing hor")








