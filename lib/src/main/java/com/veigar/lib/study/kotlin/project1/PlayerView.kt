package com.veigar.lib.study.kotlin.project1

/**
 * @description:
 *
 * @author: houwj
 * @date: 2020/12/11
 */
interface PlayerView{
    fun getPlayButton()

    fun showView()
}


class MediaPlayView(playerView:PlayerView) : PlayerView by playerView