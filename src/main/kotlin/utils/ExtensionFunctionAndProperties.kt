package org.example.utils

import java.util.concurrent.Flow

class ExtensionFunctionAndProperties {
}


data class Item(val name: String, val price: Flow)

data class Order(val item: Collection<Item>)


fun main() {

}