package com.example.listviewformyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

    public class MainActivity extends AppCompatActivity {
        ListView lv;
        ArrayList<Teacher> teachersList;
        TeacherAdapter teacheradapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Teacher t1 = new Teacher(10, "roni roben", "computer sience");
            Teacher t2 = new Teacher(5, "the green arrow ", "Fighting skills");
            Teacher t3 = new Teacher(3, "avtar ", "air");
            Teacher t4 = new Teacher(1, " argentina ", "computer sience");
            Teacher t5 = new Teacher(2, "gorgia", " Horses ");
            Teacher t6 = new Teacher(4, "pika ", "computer sience");


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


        }
    }
