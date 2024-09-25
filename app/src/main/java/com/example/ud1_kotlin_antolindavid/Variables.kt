package com.example.ud1_kotlin_antolindavid

fun main() {
    //numericas()
    //alfanum()
    //logicas()
    showMyName("Slim Shady")
    showMyNameAndAge("Slim Shady", 38)
    showMyNameAndAge("Slim Shady")
    var resta1 = subtract(10,5)
    println("Resta1: $resta1 Resta2 = ${subtract(10,50)}")
    println("Multiplicación: ${multiply(4,5)}")
    println("División: ${divide(4,5)}")
    var aux = 2/3
}

fun alfanum() {
    //Char
    val myChar = 'u'

    //String
    var myString = "Mi nombre es: " // dfbkasbk
    val name = "David"
    println(myString + name)
    var msg = "Mi nombre es: $name"
    println(msg)
    println("Soy: $name")
    println("Soy en mayúsculas: ${name.uppercase()}")

}

fun numericas() {
    // Int
    val age:Int = 38
    val age2 = 38
    var age3 = 38
    //age2 = 40 ESTO NO SE PUEDE
    println(age)
    println(age3)
    age3 = age+age2
    println(age3+10)

    //LONG
    val superficie:Long = 123325424
    val super2 = 2147483648
    println(super2)

    // FLOAT & DOUBLE
    var volumen = 10.5
    var volumen3:Float = 10.5f
    var volumen2 = 10.5f
    val volumen4:Double = 10.5
    println(volumen)
    println(volumen3)
}

fun logicas(){
    //Boolean
    val trueOrFalse:Boolean = true
    val tOrF = false
    println("Primera: $trueOrFalse y Segunda: $tOrF")

    //Operaciones
    var nueva = !tOrF
    nueva = 10 > 6
    val nueva2 = trueOrFalse || tOrF
    nueva = trueOrFalse && tOrF
    val nueva3 = nueva || nueva2

}

fun showMyName(name:String) {
    println("My name is: $name")
}

fun showMyNameAndAge(name:String, age:Int=33) {
    println("My name is: $name and my age is: $age")
}

fun subtract(first:Int, second:Int):Int {
    //println("La resta es: ${first-second}")
    return first-second
}

fun multiply(first:Int, second:Int):Int = first*second
fun divide(first:Int, second:Int) = (first.toDouble()/second)