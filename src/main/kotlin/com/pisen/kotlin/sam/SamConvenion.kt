package com.pisen.kotlin.sam

import com.pisen.java.sam.SamInJava

fun main() {
    val sam = SamInJava();
    sam.addTask (Runnable {
        println("Hello")
    });
}