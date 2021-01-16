package com.info.nesnetabanliprogramlama

fun main(){

    val kamilKoc = Otobus(50,"Bursa","Ankara",10)

    kamilKoc.bilgiAl()

    kamilKoc.kapasite = 100
    kamilKoc.nereden = "İzmir"
    kamilKoc.nereye = "İstanbul"
    kamilKoc.mevcutYolcu = 30

    kamilKoc.bilgiAl()

    kamilKoc.yolcuAl(20)
    kamilKoc.bilgiAl()

    kamilKoc.yolcuIndir(40)
    kamilKoc.bilgiAl()

    val otobusFirmasi = Otobus(50,"Bursa","İzmit",5)

    otobusFirmasi.bilgiAl()
    otobusFirmasi.yolcuAl(10)
    otobusFirmasi.bilgiAl()

}