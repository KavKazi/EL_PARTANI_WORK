package com.example.listviewformyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

    public class MainActivity extends AppCompatActivity {
        ListView lv;
        ArrayList<Teacher> teachersList;
        TeacherAdapter teacheradapter;
        GridView gridView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
                ////select teacher screen..
            Bitmap teacherpic1 = BitmapFactory.decodeResource(getResources(),R.drawable.teacherpic1);
            Bitmap teacherpic2 = BitmapFactory.decodeResource(getResources(),R.drawable.teacherpic2);
            Bitmap teacherpic3 = BitmapFactory.decodeResource(getResources(),R.drawable.teacherpic3);
            Bitmap teacherpic4 = BitmapFactory.decodeResource(getResources(),R.drawable.teacherpic4);
            Bitmap teacherpic5 = BitmapFactory.decodeResource(getResources(),R.drawable.teacherpic5);
            Bitmap teacherpic6 = BitmapFactory.decodeResource(getResources(),R.drawable.teacherpic6);



            Teacher t1 = new Teacher("רוני רובן ", "י-יב", teacherpic1);
            Teacher t2 = new Teacher("ארגנטינה  ", "י-יב", teacherpic2);
            Teacher t3 = new Teacher("מסי  ", "י-יב", teacherpic3);
            Teacher t4 = new Teacher("גורגיה  ", "י-יב", teacherpic4);
            Teacher t5 = new Teacher("פיקצו ", "י-יב", teacherpic5);
            Teacher t6 = new Teacher("פיקה פיקה  ", "י-יב", teacherpic6);

            teachersList = new ArrayList<Teacher>();
            teachersList.add(t1);
            teachersList.add(t2);
            teachersList.add(t3);
            teachersList.add(t4);
            teachersList.add(t5);
            teachersList.add(t6);

            teacheradapter = new TeacherAdapter(this,0,0,teachersList);
            lv =(ListView)findViewById(R.id.lv);
            lv.setAdapter(teacheradapter);
            ////select teacher screen is over..

            String[]professionsName= {"מתמטיקה ","אנגלית", "עברית ","היסטוריה ","ספרות"};
            int[]professionImage = {R.drawable.mathbackground,R.drawable.englishbackground,R.drawable.hebrowbackground,R.drawable.safrotbackground,R.drawable.historybackground};

            ProfessionAdapter professionAdapter = new ProfessionAdapter(MainActivity.this,professionsName,professionImage);
            gridView.setAdapter(professionAdapter);
            gridView.setOnItemClickListener((AdapterView.OnItemClickListener) professionAdapter);


        }


        }

