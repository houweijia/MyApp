package com.veigar.lib.study.kotlin.project1

/**
 * @description:
 *
 * @author: houwj
 * @date: 2020/12/10
 */
data class User(
    var id: Int,
    var name: String,
    var playType: PlayViewType = PlayViewType.BLUE
)