package com.raj.ds.topic.array

import com.raj.ds.printDash

/**
 * To print all sub array of given array
 */
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

/**
 * To print largest sum of sub array
 */
fun subArrayLargestSumBruteForce(array: Array<Int>) {
    var sum = 0
    for (i in 0..array.size - 1) {
        for (j in i..array.size - 1) {
            var subSum = 0
            for (k in i..j) {
                subSum = subSum + array[k]
            }
            if (sum < subSum) {
                sum = subSum
            }
        }
    }
    println("Sum : $sum")
}

fun main() {
    printDash()
    println("Sub array :")
    subArray(arrayOf(1, 2, 3, 4, 5, 6))
    printDash()
    println("Sub array largest sum by brute force:")
    subArrayLargestSumBruteForce(arrayOf(1, 2, 3, 4, 5))
}