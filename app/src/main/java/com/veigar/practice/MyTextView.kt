package com.veigar.practice

import android.content.Context
import android.util.AttributeSet
import android.view.View

/**
 * @description:
 *
 * @author: houwj
 * @date: 2020/12/10
 */
class MyTextView : View{
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes)
}