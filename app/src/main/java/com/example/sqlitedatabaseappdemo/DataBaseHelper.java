package com.example.sqlitedatabaseappdemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {

    private static final String DataBse_Name = "ContactData";
    private static final int DataBse_Version = 1;
    private static final String TABLE_NAME = "contact";
    private static final String KEY_ID = "ID";
    private static final String KET_NAME = "Name";
    private static final String KEY_NO = "PhoneNo";

    public DataBaseHelper(@Nullable Context context) {
        super(context, DataBse_Name, null, DataBse_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE " + TABLE_NAME +
                "(" + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + KET_NAME + " TEXT," + KEY_NO + " TEXT)");

//        db.execSQL("CREATE TABLE CONTACT (ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, PHONE_NO TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
//            onCreate(db);
    }

    public void addContact(String name, String PhoneNo)
    {
        SQLiteDatabase SQL = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(KET_NAME, name);
        values.put(KEY_NO, PhoneNo);

        SQL.insert(TABLE_NAME, null, values);
    }
}
