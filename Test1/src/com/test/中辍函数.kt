package com.test

/**
 *自定义中缀函数--->（扩展函数）
 * 1.使用infix在fun前修饰
 * 2.只能有一个参数（uniqueParam）
 * 3.是二元的的，参数1：实例（北京）；参数二：参数
 */
infix fun String.中缀(uniqueParam: String): String {
    return "啦啦啦，我是中缀函数，实例是：" + this + ",我的唯一参数是" + uniqueParam
}

val resultInfix = "北京" 中缀 "上海"

fun  main(args:Array<String>){
    println(resultInfix)
}


