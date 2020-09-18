package com.test

class Test5 {
    fun main(args: Array<String>) {
        // 执行test闭包的内容
        test
    }

    // 定义一个比较测试闭包
    val test = if (5 > 3) {
        println("yes")
    } else {
        println("no")
    }
}