package com.tuonbondol.kotlin

interface Vehicle{
    val MakeName:String

    fun go(){
        println("Let go, go")
    }

    fun stop(){
        println("Screehing")
    }

    fun getMpg():Int{
        return 50
    }

    fun getDoors():Int
}