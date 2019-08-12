package com.pisen.string


fun getName(): String? {
    return null
}


fun main() {

    val p: Parent
//    val c: Child



//    val name = getName() ?: return
//    println(name?.length)
    var name: String = getName() ?: return
    val values: String? = "Hello World"
    println(values!!.length)

}


