package com.pisen.hof2

fun main(args:Array<String>) {
    var list = listOf<Int>(1,2,3,4,5,6,8,10,2,1,4)
//    list.forEach(::println)
    var newList = ArrayList<Int>()
//        list.forEach {
//            var element  = it * 2 + 3
//            newList.add(element)
//        }
//    newList.forEach(::println)
    val newList2 = list.map { it*2 + 3 }


//    val newList4 = list.map { it::toDouble }
    val newList5 = list.map(Int::toDouble)

//    newList5.map {
//        println(it)
//    }
//    newList2.forEach(::println)
//    list.map { it*2 +3 }.forEach(::println)

//    newList5.map(::println)
//    newList5.forEach(::println)
  //  flatMap()

//    (0..6).map { factorial(it) }.apply { println(this) }
//    (0..6).map { factorial(it) }.fold(5){acc, i -> acc+i }.also { println(it) }

//    (0..6).map(::factorial).filter { it % 2 == 1 }.also { println(it) }
//    (0..6).map(::factorial).filterIndexed{ index, i -> index %2==1 }.also { println(it) }

//    takeWhile()

//     print(hof02KT::takeWhile)
}

fun takeWhile(){
    (0..6).map(::factorial).takeWhile {
        it % 2 ==1
    }.also{
        println(it) }
}

fun flatMap(){
    val list  = listOf(0..100,2..5,200..208)

//    val flatList = list.flatMap {
//            it.map {
//                "NO:$it"
//            }
//    }
//    flatList.forEach(::println)

    val flatList = list.flatMap { it.map { it } }

//    flatList.reduce { acc, s -> acc+s }.also {
//        println(it)
//    }

//    (0..6).joinToString(",").also { println(it) }

    (0..6).map(::factorial).filter { it % 2 == 1 }.also { println(it) }
}

fun factorial(n:Int):Int{
    if (n==0) return 1
    return (1..n).reduce{
        acc, i ->  acc*i
    }
}