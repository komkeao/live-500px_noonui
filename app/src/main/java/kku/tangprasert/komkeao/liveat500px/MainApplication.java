package kku.tangprasert.komkeao.liveat500px;

import android.app.Application;

import kku.tangprasert.komkeao.liveat500px.manager.Contextor;

/**
 * Created by MainUser on 8/1/2560.
 */

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        Contextor.getInstance().init(getApplicationContext());
        super.onCreate();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
