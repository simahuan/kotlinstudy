package com.pisen.string

fun main() {
/*     val h:Char = 'H'
     val e:Char = 'E'
    println(""" $h $e""")
*/
//    val s:String = "HelloWorld"
//    println(s)
//
//    val str:String = String(charArrayOf('H','e','l','l','o','W','o','r','l','d'))
//    println(str)
//
//    println(s==str)
//    println(s===str)


    var arg1:Int = 0
    var arg2:Int = 1
    println(" "+arg1+" + "+arg2+" = "+(arg1 + arg2))

    println("$arg1 + $arg2 = ${arg1 + arg2}")

    //Hello Trump
    val sayHello:String = "Hello \"Trump\""
    println(sayHello)

    println("$1000")

    val salary:Int = 1000
    println("\$salary")

    val rawString :String = """
        <Html>
        </Html>
        
        
        
        
        \t
        \n
        \\\\\\\\\\$$$ salary
    """.trimIndent()
    println(rawString)
    println(rawString.length)


//    var s1 = "Trulp"
//    println()

}