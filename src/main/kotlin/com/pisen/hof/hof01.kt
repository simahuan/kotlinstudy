package com.pisen.hof

fun main(args:Array<String>) {

//    args.forEach { ::println }
    args.forEach(::println)

    val helloWorld = Hello::world

    args.filter(String::isNotEmpty)

}

class Hello{
    fun world(){
        println("Hello World.")
    }

}