package com.pisen.attribute

class X

class Person  constructor(val name:String,val age:Int){
   // constructor(val height:Int)
    init {

    }
    val gender:Boolean = false
        get() {
            println("gender get...")
            return field
        }
    var weight:Int = 0
        set(value) {
            println("weight initial  set method")
            field = value
        }
    lateinit var hoppy:String
    val height by lazy {
        println("lazy 初始化 ")
        X()
    }

    lateinit var work:X
     var width:Double = 0.0

}

fun main() {
    val p = Person("zhangsan",18)
    println(p.age)
    println(p.name)
    println(p.gender)
    p.weight = 172
    println(p.weight )
//    println(p)
    println(p.height)
}