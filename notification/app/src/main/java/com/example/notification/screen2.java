package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class screen2 extends AppCompatActivity {
    Button btn_push, btn_cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        btn_cancel=findViewById(R.id.btn_cancel);
        btn_push = findViewById(R.id.btn_push);
        btn_push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //phase1
                int icon = R.drawable.ic_launcher_background;
                String ticket = "this id the ticket message";
                long when= System.currentTimeMillis();
                String title = "title";
                String ticker = "ticker";
                String text = "text";
                //phase2
                Intent intent =new Intent(screen2.this, MainActivity.class);
                intent.putExtra("key", "i whant a burekas");
                PendingIntent pendingIntent = PendingIntent.getActivities(screen2.this,0,intent,0);



            }
        });
    }
}