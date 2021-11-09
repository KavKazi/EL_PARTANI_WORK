package com.example.listviewformyapp;
import android.graphics.Bitmap;

public class Teacher {
        private String Name;
        private String claas;
        private Bitmap bitmap;

        public Teacher(String name, String claas, Bitmap bitmap) {
            this.Name = name;
            this.claas = claas;
            this.bitmap = bitmap;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            this.Name = name;
        }

        public String getClaas() {
            return claas;
        }

        public void setClaas(String claas) {
            this.claas = claas;
        }


  public android.graphics.Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(android.graphics.Bitmap bitmap) {
        this.bitmap = bitmap;
    }


    }

