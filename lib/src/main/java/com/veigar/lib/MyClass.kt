package com.veigar.lib

import java.io.File

open class MyClass {
    fun test() {
        val i = 1
        print("i=====$i")
        val test1 = Test1("1")
        val s = test1.name ?: return


    }


    fun foo() {
        listOf(1, 2, 3, 4, 5).forEach lit@{
            if (it == 3) return@lit // 局部返回到该 lambda 表达式的调用者，即 forEach 循环
            print(it)
        }
        print(" done with explicit label")
    }

    class Test1 {
        constructor(a: String)

        val name = "1"

        fun test() {
            print("123455555")
        }
    }

    fun foo(x: Any): String {
        val a = 1

        var b: String = ""


        return "x====$x"
    }

    fun parseInt(str: String): Int? {
        var list = ArrayList<String>()
        list.add("1")
        list.add("2")
        list.add("3")
        list.add("4")
        list.add("5")
        var s = list[0]
        str[0]
        var iterator = list.iterator()

        while (iterator.hasNext()) {
            var next = iterator.next()
            print(next)
        }

        val items = listOf("1", "2", "3")
        for (item in items) {

        }

        var index = 0


        return null
    }

    /**
     * 使用 lambda 表达式来过滤（filter）与映射（map）集合：
     */
    fun foo1() {
        val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
        fruits.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }

        var list = ArrayList<Int>()
        list.add(1)
        list.add(2)
        list.add(3)
        list.add(4)
        list.add(5)
        val list1 = list.filter { it > 2 }
        list1.forEach { println(it)  }

        val files = File("Test").listFiles()

        println(files?.size)

        //val emails = listOf("a","b")
        val emails = listOf("a","b")
        var listStr = ArrayList<String>()
        print(listStr.firstOrNull()?:"empty")
        print(emails.firstOrNull()?:"empty")

        var numbers = mutableListOf(1,2,3,4,5)
        numbers.add(2)
        numbers.removeAt(1)


    }


    fun foo2(){
        val products = listOf(
            Product("WebStorm", 49.0f),
            Product("AppCode", 19.0f),
            Product("DotTrace", 129.0f),
            Product("ReSharper", 149.0f)
        )
        println(products.binarySearch (Product("AppCode", 19.0f),  compareBy<Product>{it.getPrice()}.thenBy { it.getName() } ) )
        var store = Store("1","店铺1")
        store.storeName = "123";
        println(store.storeName+"-------"+store.storeId)

    }



}


data class Salary(var base: Int = 100){
    override fun toString(): String = base.toString()

}


fun getSalary(){
    operator fun Salary.plus(other: Salary): Salary = Salary(base + other.base)
    operator fun Salary.minus(other: Salary): Salary = Salary(base - other.base)

    val s1 = Salary(10)
    val s2 = Salary(20)
    println(s1 + s2) // 30
    println(s1 - s2) // -10
}

