package com.veigar.practice

import android.app.Service
import android.os.Bundle
import android.os.Looper
import android.os.Vibrator
import android.util.Log
import android.util.LruCache
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.veigar.mylibrary.ConcurrentHashSet
import java.math.BigDecimal


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)
        var linearLayout :LinearLayout = LinearLayout(this)
        linearLayout.addView(View(this))
       // if(linearLayout is View )
//        var findViewById = findViewById<TextView>(R.id.tv)
//        findViewById.setOnClickListener(View.OnClickListener {
////            val vibrator = this.getSystemService(this.VIBRATOR_SERVICE) as Vibrator
////            val patter = longArrayOf(1000, 1000, 2000, 50)
////            vibrator.vibrate(patter, 0)
//
////            Vibrator vibrator = (Vibrator)this.getSystemService(this.VIBRATOR_SERVICE);
////            long[] patter = {1000, 1000, 2000, 50};
////            vibrator.vibrate(patter, 0);
//
//           val a = 0
//            val b = a/0
//        })

//
//        Thread(Runnable {
//            Looper.prepare()
//            Log.e("<<<","loop前")
//            Looper.loop()
//            Log.e("<<<","loop后")
//        }).start()

        var map :LinkedHashMap<String,String> = LinkedHashMap()

        map.put("1","a");
        map.put("2","b")
        map.put("3","c")
        map.put("4","d")

        map.get("3")
        map.put("5","e")

        for (key in map.keys) {
            Log.e("<<<","key===$key")
        }


        var lruCache :LruCache<String,String> = LruCache(5)
        lruCache.put("1","a");
        lruCache.put("2","b")
        lruCache.put("3","c")
        lruCache.put("4","d")

        lruCache.get("3")
        lruCache.put("5","e")

        BigDecimal(0.1
        )

//        for (key in  lruCache.snapshot().keys) {
//            Log.e("<<<","key===$key")
//        }


//        BaseThread(Runnable {
//            Log.e("<<<","BaseThread")
//        }).start()

    }

    fun test(){
       // for ()
    }
}