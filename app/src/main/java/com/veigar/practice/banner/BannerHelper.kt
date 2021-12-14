package com.veigar.practice.banner

import android.content.Context
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator
import com.veigar.practice.R

/**
 * @description:
 *
 * @author: houwj
 * @date: 2021/1/27
 */
open class BannerHelper {

    fun getBanner(context: Context): View {
        val view: View = View.inflate(context, R.layout.banner_view, null);
        val bannerVp: ViewPager = view.findViewById(R.id.vp_banner)
        var indicator : WormDotsIndicator = view.findViewById(R.id.indicator)
        bannerVp.pageMargin = 50
        bannerVp.offscreenPageLimit = 3
        var list: List<String> = listOf("banana", "avocado", "apple", "kiwifruit")
        var bannerPagerAdapter: BannerPagerAdapter = BannerPagerAdapter(list, context)

        bannerVp.adapter = bannerPagerAdapter
        bannerVp.currentItem = list.size * 1000
        indicator.setViewPager(bannerVp)
        return view

    }
}