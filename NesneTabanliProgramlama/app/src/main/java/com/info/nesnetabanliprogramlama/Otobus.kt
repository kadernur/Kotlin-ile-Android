package com.info.nesnetabanliprogramlama

class Otobus (var kapasite:Int,var nereden:String,var nereye:String,var mevcutYolcu:Int) {

    fun yolcuAl(yolcu:Int){
        mevcutYolcu = mevcutYolcu + yolcu
    }

    fun yolcuIndir(yolcu:Int){
        mevcutYolcu = mevcutYolcu - yolcu
    }

    fun bilgiAl(){
        println("Kapasite : $kapasite")
        println("Nereden : $nereden")
        println("Nereye : $nereye")
        println("Yolcu Sayısı : $mevcutYolcu")
    }

}