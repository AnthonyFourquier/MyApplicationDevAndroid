package com.example.tpkotlin

import java.util.Scanner

fun main() {

    println("Entrer une note ou terminer avec -1 : ")
    var reader = Scanner(System.`in`)
    var note = readln().toFloatOrNull() ?: -1
    var moyenne =  mutableListOf<Float>()

    while (note != -1) {
        println("Entrer une note ou terminer avec -1 : ")
            moyenne.add(note.toFloat())
            note = readln().toFloatOrNull()
    }
    println("La moyenen est de " + moyenne.average())

    println("___________________________________________")

    var nbFirst =  mutableListOf<Int>()
    var diviseur:Int = 0
    for (i in 2 .. 1000) {
        for(y in 2 .. 1000) {
            if (i % y == 0) {
                if (i == y) {
                    if (i%2 !=0) {
                        nbFirst.add(i)
                    }
                }
            }
        }
    }
    println(nbFirst)
}