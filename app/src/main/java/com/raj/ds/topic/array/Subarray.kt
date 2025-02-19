package com.raj.ds.topic.array

import com.raj.ds.printDash


fun subArray(array: Array<Int>) {
    for (i in 0..array.size - 1) {
        for (j in i..array.size - 1) {
            for (k in i..j) {
                print("${array[k]} ")
            }
            println()
        }
        println()
    }
}

fun main() {
    printDash()
    println("Sub array :")
    subArray(arrayOf(1, 2, 3, 4, 5, 6))
    printDash()
    
}