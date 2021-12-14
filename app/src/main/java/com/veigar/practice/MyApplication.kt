package com.veigar.practice

import android.app.Application
import com.hjq.toast.ToastUtils
import com.tencent.mmkv.MMKV


/**
 * @description:
 *
 * @author: houwj
 * @date: 2020/11/16
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
//        initFlipper();
        ToastUtils.init(this);
        BaseLibConfig.context = this
        val rootDir = MMKV.initialize(this)
        println("mmkv root: $rootDir")
    }
//
//    fun initFlipper(){
//        SoLoader.init(this, false)
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
//       // client.addPlugin(LeakCanaryFlipperPlugin())
////CrashReporter插件
////CrashReporter插件
//        client.addPlugin(CrashReporterPlugin.getInstance())
//        client.start()
//    }
}