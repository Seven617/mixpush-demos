package cn.leancloud.demo.xiaomi_push;

import android.app.Application;

import cn.leancloud.AVLogger;
import cn.leancloud.AVMixPushManager;
import cn.leancloud.AVOSCloud;


/**
 * Created by fengjunwen on 2018/1/22.
 */

public class MyApp extends Application {
  // 请替换成您自己的 appId 和 appKey
  private static final String LC_APP_ID = "Gvv2k8PugDTmYOCfuK8tiWd8-gzGzoHsz";
  private static final String LC_APP_KEY = "dpwAo94n81jPsHVxaWwdxJVu";
  private static final String LC_SERVER = "https://gvv2k8pu.lc-cn-n1-shared.com";

  // 请替换成您自己的小米 appId 和 appKey
  private static final String XIAOMI_APP = "yourAppId";
  private static final String XIAOMI_KEY = "yourAppKey";

  @Override
  public void onCreate() {
    super.onCreate();

    AVOSCloud.setLogLevel(AVLogger.Level.DEBUG);
    AVOSCloud.initialize(this,LC_APP_ID,LC_APP_KEY, LC_SERVER);
    AVMixPushManager.registerXiaomiPush(this, XIAOMI_APP, XIAOMI_KEY);
  }
}
