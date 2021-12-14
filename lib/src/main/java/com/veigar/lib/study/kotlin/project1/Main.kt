package com.veigar.lib.study.kotlin.project1

/**
 * @description:
 *
 * @author: houwj
 * @date: 2020/12/10
 */
fun main(args: Array<String>) {
    val user = User(1,"name")
    PlayerUI.get().showPlayer(user)

}