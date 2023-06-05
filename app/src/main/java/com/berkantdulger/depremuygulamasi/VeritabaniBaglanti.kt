package com.berkantdulger.depremuygulamasi

class VeritabaniBaglanti {
    var id:Int=0
    var adsoyad:String=""
    var parola:String=""
    var telefon:String=""
    var mail:String=""
    var kisisayisi:String=""
    var konu:String=""
    var adres:String=""

    constructor(adsoyad:String,parola:String,telefon:String,mail:String,
                kisisayisi:String,konu:String,adres:String){

        this.adsoyad=adsoyad
        this.parola=parola
        this.telefon=telefon
        this.mail=mail
        this.kisisayisi=kisisayisi
        this.konu=konu
        this.adres=adres
    }
    constructor(){

    }
}