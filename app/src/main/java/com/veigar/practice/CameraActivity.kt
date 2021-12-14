package com.veigar.practice

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity

/**
 * @description:
 *
 * @author: houwj
 * @date: 2021/3/26
 */
open class CameraActivity  : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)
//        val cameraView : CameraView = findViewById(R.id.camera1)
//        val iv : ImageView = findViewById(R.id.iv)
//        iv.setColorFilter(getColor("rgba(255, 0, 0, 1)"))
//        //cameraView.open()
//        iv.setOnClickListener(View.OnClickListener {
//            ToastUtils.show("123456")
//        })

        val view :View = findViewById(R.id.view)
        view.layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
        val drawable = GradientDrawable()
        view.setLayerType(View.LAYER_TYPE_SOFTWARE, null)
        drawable.shape = GradientDrawable.LINE
        drawable.setStroke(3, getColor("rgba(219,6,6,1.00)"), 6f, 5f)
        view.background = drawable

//        var paint = Paint()
//        paint.style = Paint.Style.STROKE
//        var canvas = Canvas()
//        canvas.drawPoints()
    }



     fun getColor(rgba: String?): Int {
        rgba ?: return 0
        var color = rgba.replace("rgba(", "").replace(")", "").replace(" ", "").trim()
        var list = removeUtf8Bom(color).split(",")
        if (!list.isNullOrEmpty() && list.size == 4) {
            return Color.argb(
                (list[3].toFloat() * 255.0f + 0.5f).toInt(),
                list[0].toInt(),
                list[1].toInt(),
                list[2].toInt()
            )
        }
        return Color.BLACK
    }

    private fun removeUtf8Bom(str: String): String {
        var str = str
        if (str.startsWith("\uFEFF")) {
            str = str.substring(1)
        }
        if (str.endsWith("\uFEFF")) {
            str = str.substring(0, str.length - 1)
        }
        return str
    }
}