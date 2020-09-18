package com.test

/**
 * 闭包就是能够读取其他函数内部变量的函数
 */

fun test(): () -> Unit {
    var a = 0
    return fun () {
        a++
        println(a)
    }
}

fun main() {
    val t = test()
    println(t())
    println(t())
    println(t())
}
