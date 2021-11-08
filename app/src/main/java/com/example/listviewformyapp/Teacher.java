package com.example.listviewformyapp;
import android.graphics.Bitmap;

public class Teacher {

        private int Lvl;
        private String Name;
        private String Claas;
        // private Bitmap Bitmap;

        public Teacher(int lvl, String name, String claas) {
            Lvl = lvl;
            Name = name;
            Claas = claas;
            // Bitmap = bitmap;
        }

        public int getLvl() {
            return Lvl;
        }

        public void setLvl(int lvl) {
            this.Lvl = lvl;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            this.Name = name;
        }

        public String getClaas() {
            return Claas;
        }

        public void setClaas(String claas) {
            this.Claas = claas;
        }

  /*
  public android.graphics.Bitmap getBitmap() {
        return Bitmap;
    }

    public void setBitmap(android.graphics.Bitmap bitmap) {
        this.Bitmap = bitmap;
    }
    */

    }

