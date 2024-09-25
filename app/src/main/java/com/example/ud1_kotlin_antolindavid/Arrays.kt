package com.example.ud1_kotlin_antolindavid

fun main(){
    val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    println(weekDays.size)

    for(pos in weekDays.indices) {
        print("$pos:")
        println(weekDays[pos])
    }
    println()
    println()
    for((i,v) in weekDays.withIndex()) {
        println("$i:$v")
    }

    println()
    println()
    for(day in weekDays) print("$day,")
}