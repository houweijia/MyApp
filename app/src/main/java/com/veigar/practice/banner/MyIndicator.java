package com.veigar.practice.banner;

import android.content.Context;
import android.util.AttributeSet;

import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.OnPageChangeListenerHelper;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @description:
 * @author: houwj
 * @date: 2021/1/28
 */
class MyIndicator extends BaseDotsIndicator {
    public MyIndicator(@NotNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @NotNull
    @Override
    public Type getType() {
        return null;
    }

    @Override
    public void addDot(int i) {

    }

    @NotNull
    @Override
    public OnPageChangeListenerHelper buildOnPageChangedListener() {
        return null;
    }

    @Override
    public void refreshDotColor(int i) {

    }

    @Override
    public void removeDot(int i) {

    }

}
