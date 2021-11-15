package com.example.listviewformyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class profession_scree extends AppCompatActivity {
    GridView gridView;
    ProfessionAdapter professionAdapter;
    String[]professionsName;
    int[]professionImage ;
    Intent intent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        professionsName= new String[]{"מתמטיקה ", "אנגלית", "עברית ", "היסטוריה ", "ספרות"};
        professionImage = new int[]{R.drawable.mathbackground, R.drawable.englishbackground,
                R.drawable.hebrowbackground, R.drawable.safrotbackground, R.drawable.historybackground};

        setContentView(R.layout.professions_screen);

        gridView = findViewById(R.id.gridView);

        professionAdapter = new ProfessionAdapter(profession_scree.this,professionsName,professionImage);
        gridView.setAdapter(professionAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"you cliked"+professionsName[+position],Toast.LENGTH_SHORT).show();
                startActivity(new Intent(profession_scree.this, MainActivity.class));


            }
        });

    }
}
