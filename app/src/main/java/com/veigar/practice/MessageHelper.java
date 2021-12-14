package com.veigar.practice;


import android.os.Handler;
import android.os.Message;
import android.util.Log;

import java.util.Random;

/**
 * @description:
 * @author: houwj
 * @date: 2020/11/18
 */
public class MessageHelper {
  //private Presenter mPresenter;
  private String[] strs = {"礼包看起来很不错啊","真漂亮","好看","很喜欢","价格很优惠啊","看起来不错，周末来展会看看",
          "礼包怎么用？","礼包是展会上用吗","好高端啊","今天抽奖是不是iphone12?","今天抽奖是不是mate40?","现金券怎么用","策划师很专业"};

  private static MessageHelper instance = null;

  private MessageHelper(){

  }

  public static MessageHelper getInstance(){
    if(instance==null){
      synchronized (MessageHelper.class){
        if(instance==null){
          instance = new MessageHelper();
        }
      }
    }

    return instance;
  }

  private Handler mHandler = new Handler(){
    @Override
    public void handleMessage(Message msg) {
      super.handleMessage(msg);
      Random r = new Random();
      //mPresenter.checkMsgContent(strs[r.nextInt(9)]);
      mHandler.sendMessageDelayed(mHandler.obtainMessage(),1000);
      Log.e("<<<",strs[r.nextInt(13)]);

    }
  };


  public void start(){
   // this.mPresenter = mPresenter;

    if(mHandler!=null){
      Message message = mHandler.obtainMessage();
      mHandler.sendMessageDelayed(message,2000);

    }
  }

  public void stop(){
    if(mHandler!=null){
      mHandler.removeMessages(0);
      mHandler=null;
    }

  }

}
