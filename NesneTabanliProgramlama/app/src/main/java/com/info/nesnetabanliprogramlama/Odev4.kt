package com.info.nesnetabanliprogramlama

class Odev4 {

    fun kelimeAdeti(kelime:String,harf:Char){//ankara , a

        var sonuc = 0

        for (k in kelime){//a n k a r a

            if (k == harf){//a
                sonuc = sonuc + 1
            }

        }

        println("Harf Adeti : $sonuc")

    }
}