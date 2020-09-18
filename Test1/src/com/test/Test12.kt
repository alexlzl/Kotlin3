package com.test

fun main(args: Array<String>) {
    println("123456" value 3)
}

private infix fun String.value(position: Int): Char {
    return this[position]
}
//class Test12 {
//    fun main() {
//        println("123456" value 3)
//    }
//
//
//}