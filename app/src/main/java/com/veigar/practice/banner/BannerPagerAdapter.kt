package com.veigar.practice.banner

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager.widget.PagerAdapter
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator
import com.veigar.practice.R

/**
 * @description:
 *
 * @author: houwj
 * @date: 2021/1/27
 */
class BannerPagerAdapter constructor(list: List<String>, context: Context): PagerAdapter(){
    private var mList: List<String>? = null
    private var mContext :Context ?=null

    init {
        this.mList = list
        this.mContext = context
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return if (mList!!.size == 1) {
            1
        } else Int.MAX_VALUE

        return mList!!.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var view :View = View.inflate(mContext, R.layout.adapter_banner_item,null)
        var iv :ImageView = view.findViewById(R.id.iv)
        if(position%mList!!.size==0){
            iv.setBackgroundColor(mContext!!.resources.getColor(R.color.colorAccent))
        }else{
            iv.setBackgroundColor(mContext!!.resources.getColor(R.color.colorPrimary))
        }
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
       container.removeView(`object` as View)
    }
}