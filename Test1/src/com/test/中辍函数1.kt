package com.test

class Test{
    /**
     *自定义中缀函数--->（成员函数(class中)）
     * 1.使用infix在fun前修饰
     * 2.只能有一个参数（uniqueParam）
     */
    infix fun 中缀(uniqueParam: String): String {
        return "啦啦啦，我是中缀函数，我的唯一参数是" + uniqueParam
    }

    /**
     * 调用中缀函数
     */
    var useInfix = 中缀("uniqueParam")
}
fun main(args:Array<String>){
    print(Test().useInfix)
}