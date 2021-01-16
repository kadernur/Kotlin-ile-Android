package com.info.standartprogramlamayapilari

fun main(){

    var yas = 17
    var isim = "mehmet"

    //Örnek 1

    if ( yas >= 18){
        println("Reşitsiniz")
    }

    //Örnek 2 else

    if ( yas >= 18){
        println("Reşitsiniz")
    }else{
        println("Reşit değilsiniz")
    }

    //Örnek 3

    if (isim == "ahmet"){
        println("Merhaba ahmet")
    }else{
        println("Tanınmayan kişi")
    }

    //Örnek 4

    if (isim == "ahmet"){
        println("Merhaba ahmet")
    }else if ( isim == "mehmet"){
        println("Merhaba mehmet")
    }else{
        println("Tanınmayan kişi")
    }

    //Örnek 5 çoklu şart and

    var kullaniciAdi = "adminx"
    var sifre = 12345

    if (sifre == 12345 && kullaniciAdi == "admin"){// true and true : true
        println("Hoşgeldiniz")
    }else{
        println("Hatalı giriş")
    }

    //Örnek 6 çoklu şart or

    var sinif = 10

    if (sinif == 9 || sinif == 10 || sinif == 11 || sinif == 12){//
        println("AYT sınavına hazırlanabilirsiniz")
    }

    //Örnek 7 kısaltma

    var a = 10
    var b = 14

    if ( a == b)  println("Eşit") else  println("Eşit Değil")

}