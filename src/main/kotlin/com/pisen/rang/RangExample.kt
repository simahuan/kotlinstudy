package com.pisen.rang

val range:IntRange = 0..1024
val rangToUtil:IntRange = 0 until 1023
val emptyRang:IntRange = 0..-1


fun main() {
    println(range.contains(50))
    println(50 in rangToUtil)
    println(emptyRang.isEmpty())

    for (i in range){
        println("$i,")
    }

}