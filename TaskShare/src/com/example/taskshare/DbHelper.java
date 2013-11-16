package com.example.taskshare;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract.CommonDataKinds.Note;
import android.util.Log;

public class DbHelper extends SQLiteOpenHelper {
	@Override
	public void onCreate(SQLiteDatabase db) {
	    db.execSQL(Category.getSql());
	    db.execSQL(Note.getSql());
	    db.execSQL(Attachment.getSql());
	    db.execSQL(CheckItem.getSql());
	}
	 
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	    db.execSQL("DROP TABLE IF EXISTS " + Category.TABLE_NAME);
	    db.execSQL("DROP TABLE IF EXISTS " + Note.TABLE_NAME);
	    db.execSQL("DROP TABLE IF EXISTS " + Attachment.TABLE_NAME);
	    db.execSQL("DROP TABLE IF EXISTS " + CheckItem.TABLE_NAME);
	     
	    onCreate(db);      
	}    
	
	SQLiteDatabase db = dbHelper.getWritableDatabase();
	ContentValues cv = new ContentValues();
	 
	// insert
	cv.put(COL_NAME, value);
	db.insert(TABLE_NAME, null, cv);
	 
	// update
	cv.put(COL_NAME, value);
	db.update(TABLE_NAME, cv, COL_ID + " = ?", new String[]{id});
	     
	// load
	Cursor cursor = db.query(TABLE_NAME, null, COL_ID + " = ?",
	                            new String[]{id}, null, null, null);
	if (cursor.moveToFirst()) {
	    String name = cursor.getString(cursor.getColumnIndex(COL_NAME));
	}
	cursor.close();
	 
	//delete
	db.delete(TABLE_NAME, cv, COL_ID + " = ?", new String[]{id});   
	
	//////
	
	db.beginTransaction();
	try {
	    // multiple insert, update, or delete
	     
	    db.setTransactionSuccessful();
	} catch (Exception e) {
	    Log.e(TAG, e.getMessage(), e);
	} finally {
	    db.endTransaction();
	}  
	    

}
