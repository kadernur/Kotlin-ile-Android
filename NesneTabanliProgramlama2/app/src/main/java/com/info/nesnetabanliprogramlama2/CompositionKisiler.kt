package com.info.nesnetabanliprogramlama2

fun main(){

    val adres = Adres("Bursa","Osmangazi")

    val kisi = Kisiler1("Ahmet",18,adres)

    println("Kişi ad : ${kisi.ad}")
    println("Kişi yaş : ${kisi.yas}")
    println("Kişi il : ${kisi.adres.il}")
    println("Kişi ilçe : ${kisi.adres.ilce}")


}