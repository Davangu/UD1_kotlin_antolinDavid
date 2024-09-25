package com.example.ud1_kotlin_antolindavid

fun main(){
    mutableList()
    //inmutableList()
}

fun inmutableList() {
    var readOnlyList:List<String> = listOf("PMDM", "ADA", "DIN", "SGE", "INT", "EIE","PSP","PDAM")

    println("PRINT CON .TOSTRING()")
    println(readOnlyList.toString())

    println("PRINT CON FOR EACH _CLÁSICO_")
    for(asignatura in readOnlyList){
        println(asignatura)
    }

    println("PRINT CON FOR EACH LAMBDA (usando it)")
    readOnlyList.forEach {
        println(it)
    }

    var listaFiltrada = readOnlyList.filter {
        it.contains("p",true)
    }

    var listaFiltrada2 = readOnlyList.filter {
        it.startsWith("a",true)
    }

    println("PRINT CON FOR EACH LAMBDA (usando nombre de variable)")
    println(listaFiltrada.size)
    listaFiltrada.forEach { asignatura ->
        println(asignatura)
    }
}

fun mutableList() {
    val weekDays:MutableList<String> = mutableListOf("Monday", "Tuesday", "Wednesday")
    weekDays.add("Friday")
    println(weekDays)
    weekDays.add(3, "Thursday")
    println(weekDays)
    weekDays.add(1, "Invented")
    println(weekDays)
    println(weekDays.remove("Invent"))
    println(weekDays)
    println(weekDays.remove("Invented"))
    println(weekDays)

    weekDays.isNotEmpty()
}
