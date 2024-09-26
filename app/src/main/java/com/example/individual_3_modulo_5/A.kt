package com.example.individual_3_modulo_5

fun main() {

    var num1 = 10
    var num2 = 33
    var num3 = 66

    var suma = num1 + num2 + num3

    println("La suma es: $suma")

    num1 = 55

    suma = num1 + num2 + num3

    println("La nueva suma es: $suma")

    val promedio = suma / 3

    println("El promedio es: $promedio")
}
