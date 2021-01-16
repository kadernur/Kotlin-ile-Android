package com.info.nesnetabanliprogramlama

class Araba (var renk:String,var hiz:Int,var calisiyorMu:Boolean) {

    fun calistir(){
        calisiyorMu = true
    }

    fun durdur(){
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKm:Int){
        hiz = hiz + kacKm
    }

    fun yavasla(kacKm:Int){
        hiz = hiz - kacKm
    }

    fun bilgiAl(){
        println("Renk : $renk")
        println("Hız : $hiz")
        println("Çalışıyormu : $calisiyorMu")
    }

}