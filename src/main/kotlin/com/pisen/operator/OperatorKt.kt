package com.pisen.operator


class Complex(var real:Double,var imaginary :Double){
    operator fun plus(other:Complex):Complex{
        return Complex(real + other.real,imaginary + other.imaginary)
    }

    override fun toString(): String {
        return "real = $real,imaginary = ${imaginary}i"
    }
}


fun main() {
    val com  = Complex(3.0,4.0) + Complex(1.0 , 2.0)
    println(com)
}