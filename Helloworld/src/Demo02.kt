fun main() {
    val name: String = "kotlin"
    println(name)

    // lambda 表达式：var 变量名: 函数类型 = 函数实现
    // 实名函数
    val fun1: (String) -> Int = ::test

    // 匿名函数
    val fun2: (String) -> Int = fun(name: String): Int {
        println("$name -> $name")
        return 10
    }

    // 花括号
    val fun3: (String) -> Int = {
        println("name=$it")
        it.length
    }

    // 多个参数时，用_占位形参
    val fun4: (String, String) -> Int = { _, b->
        println("name=$b")
        10
    }

    fun1("Java")
    fun2("Kotlin")
    fun3("Flutter")
    fun4("React", "C++")

    // 高阶函数是将函数用作参数或返回值的函数。

    // 参数a的值为8，
    // 参数b的值为{ println(it) "Hello,world" }，本质上是把函数的实现作为参数
    test1(8) {
        println(it)
        "Hello,world"
    }

    test2(8, {
        println(it)
        "Hello,world"
    }, "王宁")

}

fun test(name: String): Int {
    println(name)
    return 666
}

fun test1(a: Int, b: (String)-> String) {// 这里参数b为函数类型
    println("a=$a")
    println("b=${b("王宁")}")
}

fun test2(a: Int, b: (String)-> String, c: String) {// 这里参数b为函数类型
    println("a=$a")
    println("b=${b("王宁")}")
    println("c=$c")
}
