package com.info.degiskenlerveveritipleri

fun main(){

    var ogrenciAdi = "ahmet"
    var ogrenciYas = 23
    var ogrenciBoy = 1.98
    var ogrenciBasHarf = 'a'

    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasHarf)

    var urun_id:Int = 3416
    var urun_ad:String = "Kol saati"
    var urun_adet:Int = 100
    var urun_fiyat:Double = 109.99
    var urun_tedarikci:String = "rolex"

    println("Ürün id : $urun_id")
    println("Ürün ad : $urun_ad")
    println("Ürün adet : $urun_adet")
    println("Ürün fiyat : $urun_fiyat")
    println("Ürün tedarikci : $urun_tedarikci")

    println("$urun_tedarikci marka $urun_ad $urun_fiyat fiyatla satılmaktadır.Stokta $urun_adet adet kalmıştır.")

    var a  = 10
    var b  = 20

    println("$a ve $b nin toplamı : ${ a+b }")


}