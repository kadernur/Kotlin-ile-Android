package com.info.nesnetabanliprogramlama2

class Mudur:Personel() {

    fun iseAl(p:Personel){
        p.iseAlindi()
    }

    fun terffiEttir(p:Personel){

        if (p is Ogretmen){
            p.maasArttir()
        }

        if (p is Isci){
            println("İşçiler terfi alamaz.")
        }

    }
}