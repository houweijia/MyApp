package com.veigar.lib.study.kotlin.dynamicproxy

/**
 * @description:kotlin中的动态代理是在编译之后转换成静态代理去调用的
 *
 * @author: houwj
 * @date: 2020/12/10
 */
class Zoo(animal: Animal) :Animal by animal {
    override fun bark() {
        println("zoo")
    }
}

fun main(args:Array<String>){
    Zoo(Dog()).bark()
}