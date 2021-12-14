package com.veigar.lib.study.kotlin

/**
 * @description:单例
 *
 * @author: houwj
 * @date: 2020/12/4
 */

/**
 * Kotlin类中没有真正的静态方法或块的定义，如果必须使用静态方法，可以在class中使用companion包装静态引用或方法的定义
 *
 */
class TopLevelClass{
    companion object{
        fun doSomeStuff(){

        }
    }

    object FakeCompanion{
        fun doOtherStuff(){

        }
    }

    fun testCompanion(){
        TopLevelClass.doSomeStuff()
        TopLevelClass.Companion.doSomeStuff()
        TopLevelClass.FakeCompanion.doOtherStuff()
    }
}