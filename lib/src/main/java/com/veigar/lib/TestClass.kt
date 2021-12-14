package com.veigar.lib

import kotlin.reflect.KClass

/**
 * @description:
 * @author: houwj
 * @date: 2020/8/10
 */
internal class TestClass {
    fun test(): String {
        return "1"
    }

//    companion object {
//        @JvmStatic
//        fun main(args: Array<String>) {
//            val myClass = MyClass()
////            myClass.test()
////            print(myClass.foo(1))
//           // myClass.parseInt("1")
//            //myClass.foo2()
//            var utilsKtInner = UtilsKtInner()
//            utilsKtInner.firstName = "hou"
//            utilsKtInner.foo1()
//            //utilsKtInner.foo1()
//           // utilsKtInner.firstName = "123"
//        }
//    }


}


fun main(args: Array<String>) {
    testClass(JavaClass::class.java)
    testClass(Product::class)
    println(JavaClass.`in`)//由于in是Kotlin的关键字 所以需要用反应号转义
    var person1 = Person1("123")
    person1.age
    person1.name

    var copy = person1.copy("1")

}


/**
 * 使用java的class
 */
fun testClass(clazz: Class<JavaClass>) {
    print(clazz.simpleName)
    var a = 1
    var b = 2
    var c = "2"
    var d: String ? = null

    println("testClass"+d?.length)

    // 操作符重载实现
    //println("a + c = ${a + c}") 错误：字符串模板限制只能为数值型
    println(
        "a + b = ${a.plus(b)} \t a - b = ${a.minus(b)} \t a * b = ${a.times(b)} \t a / b = ${a.div(
            b
        )} \t a % b = ${a.rem(b)}"
    )
}

fun testClass(clazz: KClass<Product>) {
    println(clazz.simpleName)
}