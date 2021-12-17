package com.example.jobsubmissionsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        super boolean b;
        b = onOptionsItemSelected(item);

        int id = item.getItemId();

        if (id==R.id.allStudentScreen){

            //צריך לסיים פה הוא צריך לעבור ךמסך שמראה את כל התלמידים
        }
        return true;
    }
}