package com.example.notification;

import android.util.Log;

public class FirstThread extends Thread{
  int countr =30;


    @Override
    public void run() {
        super.run();
        while (countr>0){
            try {
                Thread.sleep(1000);
                Log.d("service", "timer:"+countr);
                countr--;
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        //sto the tread when getting to 0
        stop();

    }
}
