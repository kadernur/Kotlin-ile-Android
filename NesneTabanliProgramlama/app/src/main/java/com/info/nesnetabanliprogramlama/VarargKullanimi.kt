package com.info.nesnetabanliprogramlama

fun main(){

    fun toplam(vararg sayilar:Int) : Int {//3,4,5

        var sonuc = 0

        for (s in sayilar){
            sonuc = sonuc + s
        }

        return sonuc

    }

    val t1 = toplam(1,2,3,4,5,3,5,6,7,8)
    println("t1 : $t1")
}