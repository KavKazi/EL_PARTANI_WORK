package com.example.jobsubmissionsqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class Utils {
    final static String DATABASE_NAME = "db_students";

    final static String TABLE_STUDENT = "tbl_student";
    final static String TABLE_STUDENT_COL_ID = "student_id";
    final static String TABLE_STUDENT_COL_FIRSTNAME = "firstName";
    final static String TABLE_STUDENT_COL_LASTNAME = "lastName";
    final static String TABLE_STUDENT_COL_NUMCLASS= "numClass";
    final static String TABLE_STUDENT_COL_AVGGRADE= "avgGrade";

    final static String TABLE_CLASS= "tbl_class";
    final static String TABLE_CLASS_COL_NAME = "name";
    final static String TABLE_CLASS_COL_TEACHER_NAME = "teacherName";



    final static String TABLE_TEACHER = "tbl_teacher";
    final static String TABLE_TEACHER_COL_ID = "id";
    final static String TABLE_STUDENT_COL_TFIRSTNAME = "firstName";
    final static String TABLE_STUDENT_COL_TLASTNAME = "lastName";
    final static String TABLE_TEACHER_COL_SUBJECT = "subject";

    public static void createTables(SQLiteDatabase db){
        db.execSQL("create table if not exists "+Utils.TABLE_STUDENT+
                " ("+TABLE_STUDENT_COL_ID+" INTEGER PRIMARY KEY AUTOINCREMENT ," +
                ""+Utils.TABLE_STUDENT_COL_FIRSTNAME+"text, "+
                ""+Utils.TABLE_STUDENT_COL_LASTNAME+" text, " +
                ""+Utils.TABLE_STUDENT_COL_NUMCLASS+" text, "+Utils.TABLE_STUDENT_COL_AVGGRADE+" integer)");

        db.execSQL("create table if not exists "
                + TABLE_CLASS +
                "(" + TABLE_CLASS_COL_NAME + " text, " +
                TABLE_CLASS_COL_TEACHER_NAME + " text)");

        db.execSQL("create table if not exists "
                + TABLE_TEACHER +
                "(" + TABLE_TEACHER_COL_ID + " integer, " +
                TABLE_STUDENT_COL_TFIRSTNAME + " text, " +
                TABLE_STUDENT_COL_TLASTNAME + " text,"+
                TABLE_TEACHER_COL_SUBJECT+"text)");



    }
    public static void insert_student(String firstName,String lastName,String numClass,int avgGrade,SQLiteDatabase db){
        db.execSQL("insert into TABLE_STUDENT values(null, '"+firstName+"',"+lastName+",'"+numClass+",'"+avgGrade+")");
    }

    public static ArrayList<Student> find_student_by_name(String firstName, SQLiteDatabase db) {
        ArrayList<Student> sameNameStudentList = new ArrayList<>();
        Cursor cursor = db.rawQuery("select * from " + TABLE_STUDENT, null);
        while (cursor.moveToNext()) {
            if (firstName.equals(cursor.getString(1))) {
                sameNameStudentList.add(new Student(cursor.getString(0), cursor.getString(1),
                        cursor.getString(2), cursor.getInt(3)));
            }
        }
        return sameNameStudentList;
    }

    public static ArrayList<Student> better_avrege(int avgGrade,SQLiteDatabase db){
        ArrayList<Student> betterAvrege = new ArrayList<>();
        Cursor cursor = db.rawQuery("select * from " + TABLE_STUDENT, null);
        while (cursor.moveToNext()) {
            if (avgGrade<(cursor.getInt(3))) {
                betterAvrege.add(new Student(cursor.getString(0), cursor.getString(1),
                        cursor.getString(2), cursor.getInt(3)));
            }
        }
        return betterAvrege;
    }

    public static void deletStudent( int id,SQLiteDatabase db ) {
        Cursor cursor = db.rawQuery("select * from " + TABLE_STUDENT, null);
        while (cursor.moveToNext()) {
            if (cursor.getInt(0) == id) {
                db.execSQL("delete from " + TABLE_STUDENT + " where " + TABLE_STUDENT_COL_ID + "=" + id);
            }
        }
    }

}
