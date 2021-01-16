package com.info.ilerikotlin

class IkinciThread : Runnable {

    override fun run() {

        for(i in 200..299){
            println("İkinci Thread : $i")
            Thread.sleep(100)
        }

    }
}