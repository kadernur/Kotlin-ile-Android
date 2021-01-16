package com.info.nesnetabanliprogramlama2

fun main(){

    val ogretmen:Personel = Ogretmen()
    val isci:Personel = Isci()

    val mudur  = Mudur()

    mudur.terffiEttir(ogretmen)
    mudur.terffiEttir(isci)


}