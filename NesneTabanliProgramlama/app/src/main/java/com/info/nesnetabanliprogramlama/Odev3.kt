package com.info.nesnetabanliprogramlama

class Odev3 {

    //3 - 3*2*1
    //3 - 3+2+1

    fun faktoriyelHesaplama(sayi:Int):Int{
        var sonuc = 1

        for (i in 1..sayi){//5 - 1,2,3,4,5
            sonuc = sonuc * i
        }

        return sonuc

    }
}