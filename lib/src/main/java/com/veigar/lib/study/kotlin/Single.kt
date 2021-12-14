package com.veigar.lib.study.kotlin

/**
 * @description:
 *
 * @author: houwj
 * @date: 2020/12/10
 */

class Single private constructor(){
    companion object{
        fun get():Single{
            return Holder.instance
        }
    }

    private object Holder{
        val instance = Single()
    }
}