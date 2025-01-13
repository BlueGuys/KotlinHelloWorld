/**
 * 1.kotlin是一种编程语言。
 * kotlin编译器创建一个字节代码，该字节代码可以在JVM上运行，这与Java.class文件生成的字节代码完全相同。每当两个字节代码的文件在JVM上运行时，它们就可以互相通信，这就是kotlin for Java 中建立互操作功能的方式。
 */


fun main() {
    println("Hello,我开始学习kotlin")
    test01()
//    test02()
}

/**
 * 1.基本数据类型
 * https://book.kotlincn.net/text/d-types.html
 *
 * 再kotlin中，所有东西都是对象，在这个意义上讲可以在任何变量上调用成员函数与属性。
 *
 *
 */
fun test01() {
    // 整数类型
    val byteValue: Byte = 127
    val shortValue: Short = 32767
    val intValue: Int = 2147483647
    val longValue: Long = 9223372036854775807L

    // 浮点数类型
    val floatValue: Float = 3.14F
    val doubleValue: Double = 3.141592653589793

    // 字符类型
    val charValue: Char = 'A'

    // 布尔类型
    val booleanValue: Boolean = true

    // 字符串类型
    val stringValue: String = "Hello, Kotlin!"

    // 数组类型
    val intArray: IntArray = intArrayOf(1, 2, 3, 4, 5)
    val doubleArray: DoubleArray = doubleArrayOf(1.1, 2.2, 3.3)
    val stringArray: Array<String> = arrayOf("Kotlin", "Java", "Python")

    // 打印所有值
    println("Byte Value: $byteValue")
    println("Short Value: $shortValue")
    println("Int Value: $intValue")
    println("Long Value: $longValue")
    println("Float Value: $floatValue")
    println("Double Value: $doubleValue")
    println("Char Value: $charValue")
    println("Boolean Value: $booleanValue")
    println("String Value: $stringValue")
    println("Int Array: ${intArray.joinToString()}")
    println("Double Array: ${doubleArray.joinToString()}")
    println("String Array: ${stringArray.joinToString()}")
}

/**
 * 2.控制流程
 */
@Suppress("KotlinConstantConditions")
fun test02() {
    // if表达式
    // 在 Kotlin 中，if 是一个表达式：它会返回一个值。 因此就不需要三元运算符
    var max = if (1+1==2) 10 else 8
    var rivers = arrayOf("黄河", "长江", "黑龙江")
    for (river in rivers) println(river)
}


/**
 * 集合 List
 */
@Override
fun test10() {
    // 只读 List
    val animals = listOf("老虎","狮子","猎狗")
    println(animals)

    // 可变的 List, 带有明确的类型声明
    val shapes : MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)
    println("第一个元素是 ${shapes.first()}")
    println("第二个元素是 ${shapes[1]}")
    println("最后一个元素是 ${shapes.last()}")
}
