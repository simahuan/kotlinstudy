package com.pisen.hof

fun main(args:Array<String>) {

//    args.forEach { ::println }
//    args.forEach(::println)  //包级函数引用
    val helloWorld = Hello::world  //成员函数引用
//    print(Hello::world)
//  forEach
    args.filter(String::isNotEmpty)
//    args.filter (::isNotEmpty)
    val pdfPrinter = PdfPrint()
//    args.forEach (pdfPrinter::println) //receiver :: println  形式的函数引用

//    (0..9).map(::println)
}

class PdfPrint(){
    fun println(any:Any?){
        kotlin.io.println(any)
    }
}

class Hello{
    fun world(){
        println("Hello World.")
    }
}