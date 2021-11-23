package com.example.el_partani;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Profession_screen extends AppCompatActivity {
    GridView gridView;
    ProfessionAdapter professionAdapter;
    String[] professionsName;
    int[] professionImage;
    Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        professionsName = new String[]{"מתמטיקה ", "אנגלית", "עברית ", "ספרות ", "היסטוריה"};
        professionImage = new int[]{R.drawable.mathbackground, R.drawable.englishbackground,
                R.drawable.hebrowbackground, R.drawable.safrotbackground, R.drawable.historybackground};

        setContentView(R.layout.activity_profession_screen);

        gridView = findViewById(R.id.gridView);

        professionAdapter = new ProfessionAdapter(Profession_screen.this, professionsName, professionImage);
        gridView.setAdapter(professionAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "את/ה לחצת על " + professionsName[+position], Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Profession_screen.this, MainActivity.class));


            }
        });
    }
}