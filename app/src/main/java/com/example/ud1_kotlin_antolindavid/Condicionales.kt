package com.example.ud1_kotlin_antolindavid

fun main(){
    getMonth(4)
    getTrim(7)
    getSem(14)
    result(true)
    result("sndawa")
    result(25)
    result('d')
    println(result2(25))
    println(result2("25"))
    var r3 = result3(25)
}

fun getMonth(month:Int){
    when(month){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> {
            println("No")
            println("es")
            println("un")
            println("mes")
        }
    }
}
fun getTrim(month:Int){
    when(month){
        1,2,3 -> println("1ºTrimestre")
        //println("") //ESTO DA ERROR
        4,5,6 -> println("2ºTrimestre")
        7,8,9 -> println("3ºTrimestre")
        10,11,12 -> println("4ºTrimestre")
        else -> {
            println("No")
            println("es")
            println("un")
            println("mes")
        }
    }
}

fun getSem(month:Int) {
    when(month) {
        in 1..6 -> println("1ºSemestre")
        in 7..12 -> println("2ºSemestre")
        !in 1..12 -> println("No es un mes válido")
    }
}

fun result(value:Any) {
    when(value) {
        is Int -> println(value+10)
        is String -> println(value)
        is Boolean -> if(value) println("yes")
        else -> println("no sé qué tipo es ese")
    }
}
fun result2(value:Any):Any {
    var resultado =
        when(value) {
            is Int -> value*value
            is String -> value+value
            is Boolean -> !value
            else -> "no sé qué tipo es ese"
        }
    return resultado
}
fun result3(value:Any) = when(value) {
        is Int -> value*value
        is String -> value+value
        is Boolean -> !value
        else -> "no sé qué tipo es ese"
    }

