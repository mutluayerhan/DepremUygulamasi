package com.berkantdulger.depremuygulamasi

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

val database_adi="db_Kayitlar"
val table_name="tbl_kullanicilar"
val col_id="id"
val col_name="adiSoyadi"
val col_parola="parola"
val col_telefon="telefon"
val col_mail="mail"
val col_kisiSayisi="kisiSayisi"
val col_konu="konu"
val col_adres="adres"


class databaseHelper(var context: Context):SQLiteOpenHelper(context,
database_adi,null,1 ) {
    override fun onCreate(db: SQLiteDatabase?) {
        var createTable=" CREATE TABLE "+ table_name+"("+
                col_id+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
                col_name+" VARCHAR(256),"+
                col_parola+" VARCHAR(20),"+
                col_telefon+" VARCHAR(11),"+
                col_mail+" VARCHAR(156),"+
                col_kisiSayisi+" VARCHAR(10)),"+
                col_konu+" VARCHAR(500),"+
                col_adres+" VARCHAR(256)"
        db?.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
    fun insertData(veritabaniBaglanti: VeritabaniBaglanti){

        val db=this.writableDatabase
        val cv=ContentValues()
        cv.put(col_name,veritabaniBaglanti.adsoyad)
        cv.put(col_parola, veritabaniBaglanti.parola)
        cv.put(col_telefon, veritabaniBaglanti.telefon)
        cv.put(col_mail, veritabaniBaglanti.mail)
        cv.put(col_kisiSayisi, veritabaniBaglanti.kisisayisi)
        cv.put(col_konu, veritabaniBaglanti.konu)
        cv.put(col_adres, veritabaniBaglanti.adres)

        /*
        var sonuc =db.insert(table_name,null,cv)

        if (sonuc == (-1).toLong()){
            Toast.makeText(context,text:"Hatalı",Toast.LENGTH_LONG).show()
        }else {
            Toast.makeText(context,text:"Başarılı",Toast.LENGTH_LONG).show()
        }
        */
    }
}
