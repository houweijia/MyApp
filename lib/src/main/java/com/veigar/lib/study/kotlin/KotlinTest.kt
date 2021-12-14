package com.veigar.lib.study.kotlin


import com.veigar.lib.MyClass
import com.veigar.lib.Product
import java.io.File

/**
 * @description:
 *
 * @author: houwj
 * @date: 2020/8/17
 */
fun main(args: Array<String>) {
//    test1()
//    test2()
    // test6()

    //这里在调用的时候会强转成Animal类型所以打印的式animal
    // Dog().printName(Dog())

    //test8()

    //test10()
    //test11(1,2,3,4,5)

    //println(test12(null))
    //test13()
//
//    onlyIf(true) {
//        print(1234)
//    }

    // test16()
//    test17("MCMXCIV")
//   println( longestCommonPrefix(arrayOf("flower","flow","floight","flssss","faaaa")))

//    var listNode1 = ListNode(0)
//    var listNode2 = ListNode(0)
//    var listNode3 = ListNode(0)
//    listNode1.current = 1
//    listNode2.current = 3
//    listNode3 .current = 5
//    listNode1.next = listNode2
//    listNode2.next = listNode3
//
//    var listNode4 = ListNode(0)
//    var listNode5 = ListNode(0)
//    var listNode6 = ListNode(0)
//    listNode4.current = 2
//    listNode5.current = 4
//    listNode6 .current = 6
//    listNode4.next = listNode5
//    listNode5.next = listNode6
//    var mergeTwoLists : ListNode= mergeTwoLists(listNode1, listNode4)
//   var listNodecc: ListNode? =  mergeTwoLists.next
//    while (listNodecc!=null && listNodecc.next!=null){
//        println(listNodecc.current)
//        listNodecc = listNodecc.next
//    }
    //asTest()
    //elvisTest()
    MyTest().test()
}

/**
 * let操作符
 * 操作符的作用：当时用符号?.验证的时候忽略掉null
 */
fun test1() {
    val arrTest: Array<Int?> = arrayOf(1, 2, null, 3, null, 5, 6, null)

// 传统写法
    for (index in arrTest) {
        if (index == null) {
            continue
        }
        println("index => $index")
    }

// let写法
    for (index in arrTest) {
        //index?.let { println("index => $it") }

        index?.let { println("index => $it") }

    }


}

object Test {
    //在Java调用Kotlin静态方法时加上@JvmStatic可以直接使用类名.方法名 而不需要使用 类名.INSTANCE.方法名
    //JavaClassTest该类中有调用方法
    @JvmStatic
    fun sayMessage(msg: String) {
        println(msg)
    }
}

fun test2() {
    val a = 18
    val n = "veigar"
    var str = "我今年%d岁，我叫%s"
    println(str.format(a, n))
}


/**
 * 可以加默认值
 */
fun test3(name: String = "veigar") {
    println(name)
}

/**
 * 如果函数的函数体只有一个语句的时候 可以将方法体赋值给该函数
 */
fun test4(name: String) = println(name)

/**
 * 嵌套函数
 * 用途:在某些条件下出发递归函数 不希望被外部函数访问到的函数
 */
fun test5() {
    val str = "hello world"

    fun say(count: Int = 10) {
        println(str)
        if (count > 0) {
            say(count - 1)
        }
    }

    say()

}

/**
 * 扩展函数
 */
fun test6() {
    val file = File("gradle.properties")
    println(file.readText())
}

open class Animal

class Dog : Animal()

fun Animal.name() = "animal"
fun Dog.name() = "dog"

fun Animal.printName(animal: Animal) = println(animal.name())


/**
 * ?:操作符
 * 此操作符一般和?.操作符连用。当且仅当?:左边的表达式为null时，才会执行?:右边的表达式。
 */
fun test7() {
    val testStr: String? = null

    var length = 0

// 例： 当testStr不为空时，输出其长度，反之输出-1

// 传统写法
    length = if (testStr != null) testStr.length else -1

// ?: 写法
    length = testStr?.length ?: -1
    println(length)
}

/**
 * !!操作符
 * 用法 !! 只有在我们刻意想让程序抛出NPE时才使用，解决问题的办法也就
 */
fun test8() {
    val testStr: String? = null
    println(testStr!!.length)
    //分析 可以看出，在未做空判断的情况下直接使用操作符!!的情况下，抛出了空异常

}

/**
 * as?操作符
 */
fun test9() {
    val num1: Int? = "Koltin" as Int
    println("nun1 = $num1")
}

/**
 * lambda
 */
fun test10() {
    val thread = Thread(Runnable {
        println("123456")
    })
    thread.start()

    val thread1 = Thread { -> Unit }
    thread1.start()

}

val print = { name: String ->
    println(name)
}

/**
 * 可变数量的参数
 */
fun test11(vararg numA: Int) {
    for (i in numA) {
        println(i)
    }
}

fun <T> test12(t: T?): T? {
    return t
}

fun test12() {
    val numbersMap = mapOf("one" to 1, "two" to 2, "three" to 3)

    // plus (+)
    println(numbersMap + Pair("four", 4)) // {one=1, two=2, three=3, four=4}
    println(numbersMap + Pair("one", 10)) // {one=10, two=2, three=3}
    println(numbersMap + Pair("five", 5) + Pair("one", 11)) // {one=11, two=2, three=3, five=5}

    // minus (-)
    println(numbersMap - "one") // {two=2, three=3}
    println(numbersMap - listOf("two", "four")) // {one=1, three=3}
}

/**
 * 给map设置一个默认值
 */
fun test13() {
    val map = mapOf(
        "java" to 1,
        "kotlin" to 2,
        "python" to 3
    ).withDefault { "?" }

    val map1 = HashMap<String, Object>()

    println(map.getValue("java")) // 1
    println(map.getValue("kotlin")) // 2
    println(map.getValue("c++")) // ?
}

/**
 * 使用 require 或者 check 函数作为条件检查
 **/
fun test14() {
    //普通写法
    val age = -1;
    if (age <= 0) {
        throw IllegalArgumentException("age must be negative")
    }

    //使用require去价差
    require(age > 0) { "age must be negative" }

    //使用checkNotNull 检查
    val name: String? = null
    checkNotNull(name) {
        "name must not be null"
    }
}


fun test15() {
    val product: Product = Product("123", 1f)
    product?.run {
        val str: String? = getName()
    }

    product?.apply {

    }?.getName()?.apply {

    }
}

fun onlyIf(isDebug: Boolean, block: () -> Unit) {
    if (isDebug) block
}


fun test16() {
//    Given nums = [2, 7, 11, 15], target = 9,
//
//    Because nums[0] + nums[1] = 2 + 7 = 9,
//    return [0, 1].
    var x = -100;
    var digit = 0;
    var ret = 0;
//    while (x>0){
//       // println(x%10)
//        digit = x%10
//        println("digit===$digit")
//        ret = ret*10+digit
//        x /= 10
//    }

    while (x != 0) {
        digit = x % 10
        println("digit===$digit")
        ret = ret * 10 + digit
        x /= 10
    }
    println("ret===$ret")

}


fun test17(str: String) {
    val map: HashMap<Char, Int> = HashMap()

    map['I'] = 1
    map['V'] = 5
    map['X'] = 10
    map['L'] = 50
    map['C'] = 100
    map['D'] = 500
    map['M'] = 1000
    val len: Int = str.length
    var sum: Int? = map.get(str[len - 1])
    for (index in len - 2 downTo 0) {
        //if(map.get(len[index]))
        //System.out.println("====="+(str[index]))
        if (sum != null) {
            if ((map[str[index]] as Int) < (map[str[index + 1]] as Int)) {
                sum -= (map[str[index]] as Int)
            } else {
                sum += (map[str[index]] as Int)
            }
        }

    }

    println("sum===$sum")
}

fun test18() {
    val nums = arrayOf("flower", "flow", "flight")

    // nums[0].substring()
}

//fun longestCommonPrefix(strs: Array<String>?): String? {
//    if (strs == null || strs.size == 0) return ""
//    Arrays.sort(strs)
//    var i = 0
//    val len = Math.min(strs[0].length, strs[strs.size - 1].length)
//    println("len===+$len")
//    var minLen = 0x7fffffff
//    for (str in strs) minLen = Math.min(minLen, str.length)
//    println("minLen===+$minLen")
//    while (i < len && strs[0][i] == strs[strs.size - 1][i]) i++
//    return strs[0].substring(0, i)
//}

fun longestCommonPrefix(strs: Array<String>): String? {
    val len = strs.size
    if (len == 0) return ""
    var minLen = 0x7fffffff

    for (str in strs) minLen = Math.min(minLen, str.length)
    for (j in 0 until minLen) for (i in 1 until len) if (strs[0][j] != strs[i][j]
    ) return strs[0].substring(0, j)

    println("minlen===$minLen")
    return strs[0].substring(0, minLen)


//    for (str in strs) minLen = Math.min(minLen, str.length)
//
//
//    for (j in 0 until minLen) {
//        for (i in 1 until len){
//            if (strs[0][j] != strs[i][j]) {
//                return strs[0].substring(0, j)
//            }
//        }
//        return strs[0].substring(0, minLen)
//
//    }
//
//    return ""
}

class ListNode(var x: Int) {
    var current: Int? = null
    var next: ListNode? = null


}

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode {
    var l1: ListNode? = l1
    var l2: ListNode? = l2
    val head = ListNode(0)
    var temp: ListNode = head
    while (l1 != null && l2 != null) {
        if (l1.current!! < l2.current!!) {
            temp.next = l1
            l1 = l1.next
        } else {
            temp.next = l2
            l2 = l2.next
        }
        temp = temp.next!!
    }
    temp.next = if (l1 != null) l1 else l2
    return head.next!!
}

fun asTest() {
    //不安全的转换操作符：as
    val obj: Any? = null
    val str: String = obj as String
    println(str)

    //Kotlin安全转换操作符：as?
    var obj2: Any? = 123
    var a: String? = obj2 as? String
    println(a)

}

/**
 * Kotlin Elvis运算符示例
 */

fun elvisTest() {
    var str: String? = null
    var str2: String? = "123456"

    var len1: Int = str?.length ?: -1
    var len2: Int = str2?.length ?: -1
    println(len1)
    println(len2)
}

fun mutableListTest() {
    var mutableList = MutableList(10) { "2" }
    mutableList.add("1")
    for (element in mutableList) {
        println(element)
    }

}

/**
 * 对于不可变的Map，Kotlin中使用mapOf()
 *对于可变的Map，Kotlin中使用mutableMapOf()
 *坚持要用HashMap的话，Kotlin中使用hashMapOf() (mutableMapOf()并不是HashMap，而是LinkedHashMap)
 */
fun mutableMapTest() {
    val unmodifiableMap = mapOf(1 to "a")
    // 更新只读HashMap会在编译期报错
    // unmodifiableMap[1] = "b"

    val modifiableMap = mutableMapOf(1 to "a")
    modifiableMap[1] = "b"
}

class MyTest{
    //lateinit 是用来告诉编译器，name 这个变量后续会妥善处置的。
    private lateinit var name: String

    fun test(){
        var clazz = MyClass::class.java

        var clazz2 = MyClass().javaClass

        println("clazz====$clazz")
        println("clazz2====$clazz2")
    }
}