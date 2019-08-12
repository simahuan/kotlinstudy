package com.pisen.array


val arrayOfInt:IntArray = intArrayOf(1,3,4,5,7)
val arrayOfChar:CharArray = charArrayOf('H','E','L')

val arrayOfString:Array<String> = arrayOf("","","","")

fun main() {
    println(arrayOfChar.joinToString())
    println(arrayOfChar.joinToString(""))

//    println("HelloWorld"::class.simpleName.slice(0 until ))
}