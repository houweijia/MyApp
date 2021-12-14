package com.veigar.lib.study.kotlin.project1

/**
 * @description:
 *
 * @author: houwj
 * @date: 2020/12/10
 */
class PlayerUI private constructor(){
    companion object{
        fun get():PlayerUI{
            return Holder.instance
        }
    }

    private object Holder{
        val instance = PlayerUI()
    }

    fun showPlayer(user: User){
        MediaPlayView(getPlayViewType(user.playType)).showView()
        //getPlayViewType(user.playType).getPlayButton()
    }
}