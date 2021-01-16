package com.info.nesnetabanliprogramlama

fun main(){

    val bmw = Araba("kırmızı",10,false)

    bmw.bilgiAl()

    bmw.hiz = 900
    bmw.calisiyorMu = true
    bmw.renk = "beyaz"

    bmw.bilgiAl()

    bmw.durdur()
    bmw.bilgiAl()

    bmw.calistir()
    bmw.bilgiAl()

    bmw.hizlan(100)
    bmw.hizlan(30)
    bmw.bilgiAl()

    bmw.yavasla(50)
    bmw.bilgiAl()

    val sahin = Araba("Sarı",100,true)

    sahin.bilgiAl()

    sahin.hizlan(100)
    sahin.bilgiAl()

    sahin.durdur()
    sahin.bilgiAl()


}