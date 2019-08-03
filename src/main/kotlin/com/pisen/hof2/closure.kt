package com.pisen.hof2


fun fibonacci(): () -> Long {
    var first = 0L
    var second = 1L

    return fun(): Long {
        var result = second
        second += first
        first = second - first
        return result
    }
}

fun fib(): Iterable<Long> {
    var first = 0L
    var second = 1L

    return Iterable {
        object : LongIterator() {
            override fun hasNext(): Boolean = true

            override fun nextLong(): Long {
                var result = second
                second += first
                first = second - first
                return result
            }
        }
    }
}

fun main() {
//    var add5= add(5)
//    println(add5(3))
//    add(5).also { println(it) }

//    for (i in fibonacci()){
////
////    }

//    val x = fibonacci()
//    println(x())
//    println(x())
//    println(x())
//    println(x())
//    println(x())

//    fib().forEachIndexed { index, l -> if (l <100) println(l)  }

//    for ( i in fib()){
//        if (i > 100) break
//        println(i)
//    }

    var x = count()
    println(x())
    println(x())
    println(x())
    println(x())
    println(x())
}


fun add(x: Int) = fun(y: Int) = x + y

//fun add(a:Int):(Int)->Int{
//    return fun(b:Int):Int{
//        return a+b
//    }
//}

fun count():()->Long{
    var mCount = 0L
    return fun():Long{
        return mCount++
    }
}