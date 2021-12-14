package com.veigar.lib.study.kotlin.project1

/**
 * @description:
 *
 * @author: houwj
 * @date: 2020/12/10
 */
sealed class PlayViewType {
    object BLUE :PlayViewType()
    object GREEN :PlayViewType()
}

fun getPlayViewType(type:PlayViewType) = when(type){
    PlayViewType.GREEN -> GreenPlayerView()
    PlayViewType.BLUE -> BluePlayerView()
}