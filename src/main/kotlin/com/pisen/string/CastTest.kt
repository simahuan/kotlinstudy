package com.pisen.string

fun main() {

    val parent = Parent()

    val c = parent as? Child
//
//    var it = ItCoding()
//        it.work()

//    val code = new ItCoding()


    val p = Child()
    if (p is Child){
        println(p.name)
    }




}