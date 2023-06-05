package com.berkantdulger.depremuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.berkantdulger.depremuygulamasi.databinding.ActivityKayitOlBinding
import com.berkantdulger.depremuygulamasi.databinding.ActivityMainBinding

class kayitOl : AppCompatActivity() {
    lateinit var binding: ActivityKayitOlBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= ActivityKayitOlBinding.inflate(layoutInflater)
        val ikincisayfa=binding.root
        setContentView(ikincisayfa)
        binding.BtnGiriseDon.setOnClickListener {
            val sayfauc = Intent(applicationContext, MainActivity::class.java)
            startActivity(sayfauc)
        }
        val context =this
        var db=databaseHelper(context)
        binding.btnKytOl.setOnClickListener {
            var KayitKullaniciAdi = binding.KayitKullaniciAdi.text.toString()
            var KayitParola = binding.KayitParola.text.toString()
            var KayitTelefon = binding.KayitTelefon.text.toString()
            var KayitEposta2 = binding.KayitEposta2.text.toString()
            var KayitKisiSayisi = binding.KayitKisiSayisi.text.toString()
            var ihtiyac = binding.ihtiyac.text.toString()
            var kayitAdres = binding.kayitAdres.text.toString()

            if(KayitKullaniciAdi.isNotEmpty() && KayitTelefon.isNotEmpty() && KayitParola.isNotEmpty()
                && KayitEposta2.isNotEmpty() && KayitKisiSayisi.isNotEmpty() && ihtiyac.isNotEmpty()
                && kayitAdres.isNotEmpty()){

                var kullanici= VeritabaniBaglanti(KayitKullaniciAdi,KayitParola,KayitTelefon,KayitEposta2,
                                                    KayitKisiSayisi,ihtiyac,kayitAdres)
                db.insertData(kullanici)

            }




        }
    }
}