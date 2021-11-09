package com.example.listviewformyapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
public class TeacherAdapter extends ArrayAdapter<Teacher> {
        Context context;
        List<Teacher> objects;

        public TeacherAdapter(Context context, int resource, int textViewResourceld, List<Teacher> objects) {
            super(context, resource,textViewResourceld,objects);
            this.context = context;
            this.objects = objects;

        }

    @NonNull
        @Override
        public View getView(int position,  View convertView,  ViewGroup parent) {
            LayoutInflater layoutInflater =((Activity)context).getLayoutInflater();
            View view= layoutInflater.inflate(R.layout.custom_layout,parent,false);
            TextView Tname= (TextView)view.findViewById(R.id.Tname);
            TextView Tclaas= (TextView)view.findViewById(R.id.Tclaas);
            //TextView Tlvl= (TextView)view.findViewById(R.id.Tlvl);
            //ImageView Tavatar = (ImageView) view.findViewById(R.id.Tavatar);

            Teacher temp = objects.get(position);

            // Tavatar.setImageBitmap(temp.getBitmap());
            //Tlvl.setText(String.valueOf(temp.getLvl()));
            Tname.setText(temp.getName());
            Tclaas.setText(temp.getClaas());
            return view;
        }

    }

