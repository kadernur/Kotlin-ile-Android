package com.info.ilerikotlin

import java.lang.ArithmeticException

fun main(){

    val x = 10
    val y = 4

    val dizi = Array<Int>(2){0}//[0,0]

    try{
        println("Sonuç : ${x/y}")
        println("İşlem Tamam")
        dizi[4] = 8
    }catch (e:ArithmeticException){
        println("İkinci sayı sıfıra bölünemez")
    }
    catch (e:ArrayIndexOutOfBoundsException){
        println("Dizinin boyutunu aştınız")
    }

}