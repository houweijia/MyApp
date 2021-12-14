package com.veigar.lib

/**
 * @description:
 *
 * @author: houwj
 * @date: 2020/8/11
 */
open class Product {


    private var price: Float = 0f;
    private var name: String? = null
    private var content: String? = null

    constructor(name: String?, price: Float) {
        this.price = price
        this.name = name
    }

    fun getPrice(): Float? {
        return price;
    }

    fun getName(): String? {
        return name;
    }

    fun getContent() :String?{
        return content;
    }

    var counter = 0 // 注意：这个初始器直接为幕后字段赋值
        set(value) {
            if (value >= 0) field = value
        }
}