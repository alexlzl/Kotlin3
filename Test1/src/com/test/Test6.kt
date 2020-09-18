package com.test

/**
 * 计数统计
 */
fun justCount(): () -> Unit {
    var count = 0
    return {
        println(count++)
    }
}


fun main(args: Array<String>) {

    val count = justCount()
    count()  // 输出结果：0
    count()  // 输出结果：1
    count()  // 输出结果：2
}