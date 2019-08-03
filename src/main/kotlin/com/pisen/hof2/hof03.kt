package com.pisen.hof2

import java.io.BufferedReader
import java.io.FileReader

fun main() {

/*    findPerson()?.apply {
        work()
        println(name)
       println(age)
    }

    findPerson()?.let {
            it.age
            it.name
        it.work()
    }*/

/*  val br = BufferedReader(FileReader("Hello.txt"))
    with(br){
        var lines:String
        while (true){
            lines = readLine()?:break
            println(lines)
        }
        close()
    }*/

    BufferedReader(FileReader("Hello.txt")).use {
            var lines :String
        while (true){
            lines = it.readLine()?:break
            println(lines)
        }
    }
}

data class Person(val name:String,val age:Int){
    fun work(){
        println("$name is working..")
    }
}

fun findPerson():Person?{
    return Person("张三",20)
}