package com.veigar.lib.study.kotlin.project1

import javax.swing.JOptionPane

/**
 * @description:
 *
 * @author: houwj
 * @date: 2020/12/11
 */
class GreenPlayerView :PlayerView{
    override fun getPlayButton() {
        println("显示绿色的播放器")
    }

    override fun showView() {
        JOptionPane.showConfirmDialog(null,"显示绿色播放器","绿色播放器", JOptionPane.DEFAULT_OPTION)
    }
}