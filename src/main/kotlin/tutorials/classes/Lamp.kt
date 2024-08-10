package org.example.tutorials.classes

class Lamp {

    //    property (data member)
    private var isOn: Boolean = false


    // member function
    fun turnOn() {
        isOn = true
    }


    fun turnOff() {
        isOn = false
    }

}


class Person(var name: String, var age: Int) {


    fun canVote(age: Int) {
        if (age > 18) {
            println("Cannot vote!")
        } else {
            println("Can vote!")
        }
    }

}


fun main() {
    val lamp1 = Lamp()
    var lamb2 = Lamp()


    val person = Person("David", 40)
    print("Vote Name: ${person}")


}