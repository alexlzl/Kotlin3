package com.test

class Test3 {

    fun say() {
//        Timber.i("Hello World")
    }

    /**
     * 在 Kotlin 中无返回为 Unit
     *
     * 此方法接收一个无参数的函数并且无返回
     *
     * 使用参数名加 () 来调用
     */
    fun people(hello: () -> Unit) {
        hello()
    }

    /**
     * 在 kotlin 中有一个约定，如果最后一个参数是函数，可以省略括号
     */
    fun main(args:Array<String>) {
        people ({ say() })
        people { say() }
    }

}