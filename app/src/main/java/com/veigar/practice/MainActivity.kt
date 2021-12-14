package com.veigar.practice

import android.Manifest
import android.app.IntentService
import android.content.Intent
import android.graphics.Rect
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.util.LruCache
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.blankj.utilcode.util.ActivityUtils
import com.blankj.utilcode.util.AppUtils
import com.tbruyelle.rxpermissions2.RxPermissions
import com.tencent.mmkv.MMKV
import com.veigar.practice.banner.BannerHelper
import io.reactivex.disposables.Disposable
import java.math.BigDecimal


class MainActivity : AppCompatActivity() {
    private val rxPermissions: RxPermissions = RxPermissions(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kv : MMKV? = MMKV.defaultMMKV()
        kv?.encode("abc",true)
        kv?.commit()

        if(savedInstanceState?.getString("btn")!=null){
            Log.e("<<<", "onCreate------" + savedInstanceState.getString("btn"))
        }
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        Log.e("<<<", "btn1-rootView------" + btn1.rootView)
        Log.e("<<<", "btn2-rootView------" + btn2.rootView)
        val rootView = btn1.rootView
        val rect = Rect()
        rootView.getWindowVisibleDisplayFrame(rect)
        Log.e("<<<", "rect.left--------" + rect.left)
        Log.e("<<<", "rect.bottom--------" + rect.bottom)
        Log.e("<<<", "rect.top--------" + rect.top)
        Log.e("<<<", "rect.right--------" + rect.right)

        btn1.setOnClickListener(View.OnClickListener {
//            btn1.setText("12345")
//
//            rxPermissions
//                .request(Manifest.permission.CAMERA)
//                .subscribe { granted: Boolean ->
//                    if (granted) { // Always true pre-M
//                        // I can control the camera now
//                        Log.e("<<<","yes")
//                    } else {
//
//                        Log.e("<<<","no")
//                        // Oups permission denied
//                    }
//                }
            //MessageHelper.getInstance().start()
        })

        btn2.setOnClickListener(View.OnClickListener {

            //MessageHelper.getInstance().stop()
        })

        //initFlipper();
        var linearLayout: LinearLayout = LinearLayout(this)
        linearLayout.addView(View(this))
        // if(linearLayout is View )
        var findViewById = findViewById<TextView>(R.id.tv)
        findViewById.setOnClickListener(View.OnClickListener {
//            val vibrator = this.getSystemService(this.VIBRATOR_SERVICE) as Vibrator
//            val patter = longArrayOf(1000, 1000, 2000, 50)
//            vibrator.vibrate(patter, 0)

//            Vibrator vibrator = (Vibrator)this.getSystemService(this.VIBRATOR_SERVICE);
//            long[] patter = {1000, 1000, 2000, 50};
//            vibrator.vibrate(patter, 0);

//            var vibrator :Vibrator = getSystemService(Service.VIBRATOR_SERVICE) as Vibrator
//            val patter = longArrayOf(0, 150, 300, 150,300)
//            vibrator.vibrate(patter,-1)
            val intent = Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)
        })

//
//        Thread(Runnable {
//            Looper.prepare()
//            Log.e("<<<","loop前")
//            Looper.loop()
//            Log.e("<<<","loop后")
//        }).start()

        var map: LinkedHashMap<String, String> = LinkedHashMap()

        map.put("1", "a");
        map.put("2", "b")
        map.put("3", "c")
        map.put("4", "d")

        map.get("3")
        map.put("5", "e")

        for (key in map.keys) {
            Log.e("<<<", "key===$key")
        }


        var lruCache: LruCache<String, String> = LruCache(5)
        lruCache.put("1", "a");
        lruCache.put("2", "b")
        lruCache.put("3", "c")
        lruCache.put("4", "d")

        lruCache.get("3")
        lruCache.put("5", "e")

        BigDecimal(
            0.1
        )

//        for (key in  lruCache.snapshot().keys) {
//            Log.e("<<<","key===$key")
//        }


//        BaseThread(Runnable {
//            Log.e("<<<","BaseThread")
//        }).start()
//
//        MessageHelper().start()

        //init()
    }

//    fun initFlipper(){
//        val client = AndroidFlipperClient.getInstance(this)
////Network插件
////Network插件
//        val networkPlugin = NetworkFlipperPlugin()
//        val interceptor = FlipperOkhttpInterceptor(networkPlugin)
//        client.addPlugin(networkPlugin)
////Inspector插件
////Inspector插件
//        client.addPlugin(InspectorFlipperPlugin(this, DescriptorMapping.withDefaults()))
////Sandbox插件
////Sandbox插件
//        client.addPlugin(SandboxFlipperPlugin(object : SandboxFlipperPluginStrategy {
//            @Nullable
//            override fun getKnownSandboxes(): Map<String, String>? {
//                return HashMap()
//            }
//
//            override fun setSandbox(@Nullable sandbox: String?) {}
//        }))
////SP插件
////SP插件
//        client.addPlugin(SharedPreferencesFlipperPlugin(this, "flipper_shared_preference"))
////LeakCanary插件
////LeakCanary插件
//        client.addPlugin(LeakCanaryFlipperPlugin())
////CrashReporter插件
////CrashReporter插件
//        client.addPlugin(CrashReporterPlugin.getInstance())
//        client.start()
//    }




    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.e("<<<", "onSaveInstanceState")
        outState.putString("btn","12345")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e("<<<", "onRestoreInstanceState")
        Log.e("<<<", savedInstanceState.getString("btn"))
    }

    fun test(){
       
    }

  override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
    super.onSaveInstanceState(outState, outPersistentState)
    Log.e("tag","onSaveInstanceState")
  }

  override fun onStop() {
    super.onStop()
    Log.e("tag","onStop")
  }
}