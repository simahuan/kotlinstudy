package com.pisen.string

class Meizi(  character:String,
             voice:String,
             surface:String) : Person(character,
 voice,
surface){
//    constructor(  )
//    this()
//
//    init {
//        println("new 性格:$character,长相:$surface,声音:$voice")
//    }
//
//    init {
//
//    }

    override fun eat() {
        super.eat()
        println("细嚼慢咽")
    }

}

class Boy(  character:String,
            voice:String,
            surface:String) : Person(character,
    voice,
    surface){
//    constructor(  )
//    this()
//
//    init {
//        println("new 性格:$character,长相:$surface,声音:$voice")
//    }
//
//    init {
//
//    }

    override fun eat() {
        super.eat()
        println("吃的飞快")
    }
}

open class Person(private var character:String,
             var voice:String,
             var surface:String){
    init {
        println("new 性格:$character,长相:$surface,声音:$voice")
    }

    open fun eat() {}

}

fun main() {
    val  p:Person = Meizi("温柔","甜美","动人")
    val b:Person = Boy("奔放","粗狂","彪悍")
    p.eat()
    b.eat()

}