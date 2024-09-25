package com.example.ud1_kotlin_antolindavid

fun main(){
    var name:String = "David"
    var name2:String? = null //? String nulable
    println(name)
    println(name2)

    if(name == "David"){}
    if(name.substring(0) == "David"){}

    if (name2 != null) {
        if(name2.substring(2) == "David") {}
        println("Entra aquí")
    }

    //if(name2!![0] == 'D'){ }// !! Seguro que no es null
    //name2!!.substring(1)

    if(name2?.get(0) == 'D'){ // ? Si no es nulo, dame el valor

    } else println("No entra")

    println(name2?.get(0) ?: "Es nulo") // ? Si no es nulo, dame el valor
    //name2 = "hola"
    println(name2?.get(0) ?: "Es nulo") // ? Si no es nulo, dame el valor
    showText(name2)
    var aux = showText(name)
    var aux2:Int? = null
    //var aux3 = aux2 + 10
    //println("Aux3 = $aux3")
}

fun showText(text:String?):Int?{
    println(text)
    return if(text?.length ?: 0 > 5) {
        10
    } else null
}