package com.veigar.lib

import java.lang.reflect.Array

/**
 * @description:
 *
 * @author: houwj
 * @date: 2020/8/12
 */
fun foo() {
    print("1234")
}

class UtilsKtInner : Person {


    override var firstName: String = ""
    // get() = "123"
//        set(value) {
//            field = value
//        }

    override var lastName: String = ""

//    constructor(firstName: String, lastName: String) {
//        this.firstName = firstName
//        this.lastName = lastName
//    }
//        get() = "456"
//        set(value) {}

    init {
        //初始化块
        firstName = "hou"
        foo1()

        // println("First initializer block that prints ${firstName}")
    }


    fun foo1() {
        print("firstName=$firstName")
        //firstName = "123"

        for (i in 6 downTo 0 step 2) {
            println(i)
        }


        var arrayOf = arrayOf(
            "0",
            "1",
            "2"
        )

        var array = Array(10) { a -> (a * 2) }
        for (i in array) {
            println(i)
        }
        var a = 1

        //when 相当于switch
        when(a){
            1 -> {
                println("1")
            }
            2 -> println("2")
            3 -> println("3")
            5 -> {
                println("5")
            }
            else -> {
                println("0")
            }
        }

        when(1){
            // 即x = 1,2,3时都输出1。
            1 , 2 , 3 -> {
                println("1")
            }
            5 -> {
                println("5")
            }

            in 10..20->{
                println("10~20")
            }
            else -> {
                println("0")
            }
        }

        when(a){
            is Int ->println("1")//is 相当于java中的instanceof
        }

    }


//    override var firstName: String
//        get() = "123"
//    override var lastName: String
//        get() = TODO("Not yet implemented")
}


interface Named {
    val name: String
}

interface Person : Named {
    var firstName: String
    var lastName: String

    override val name: String get() = "$firstName $lastName"
}


