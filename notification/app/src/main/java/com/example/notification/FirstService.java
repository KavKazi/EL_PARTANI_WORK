package com.example.notification;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class FirstService extends Service {
    FirstThread firstThread;
    String service_name=FirstService.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "service oncreate:"+service_name,Toast.LENGTH_SHORT);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        firstThread=null;
        Toast.makeText(this, "service ondestroy:"+service_name, Toast.LENGTH_SHORT);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this,"service onStartCommand:"+service_name,Toast.LENGTH_SHORT);
        if(firstThread==null){
            firstThread = new FirstThread();
            firstThread.start();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
       return null;
    }
}