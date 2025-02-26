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

/*
 * To print largest sum of sub array using prefix sum
 */
fun subArraySumPrefix(array: Array<Int>) {
    var sum = 0
    val prefixSum = Array(array.size) { 0 }
    prefixSum[0] = array[0]
    for (i in 1..array.size - 1) {
        prefixSum[i] = prefixSum[i - 1] + array[i]
    }
    for (i in 0..array.size - 1) {
        for (j in i..array.size - 1) {
            //If i == 0, that means, sum is direct to i to j, no need of substracting the sum of before
            //items
            var subSum  = if (i == 0) {
                prefixSum[j]
            } else{
                prefixSum[j] - prefixSum[i - 1]
            }
            if (sum < subSum) {
                sum = subSum
            }
        }
    }
    println("Sum : $sum")
}

/**
 * To print largest sum of sub array using kadane's algorithm
 */
fun kadens(array: Array<Int>){
    //Ignore negative values and reset to zero as it is not making impact on maximum sum
    var runningSum =0
    var sum =0
    for (i in 0..array.size - 1) {
        runningSum = runningSum + array[i]
        if (sum < runningSum) {
            sum = runningSum
        }
        if (runningSum < 0) {
            runningSum = 0
        }
    }
    println("Sum : $sum")
}


fun main() {
    printDash()
    println("Sub array :")
    subArray(getArray())
    printDash()
    println("Sub array largest sum by brute force:")
    subArrayLargestSumBruteForce(getArray())
    printDash()
    println("Sub array largest sum by prefix:")
    subArraySumPrefix(getArray())
    printDash()
    println("Sub array largest sum by Kadens:")
    kadens(getArray())
}

private fun getArray(): Array<Int> = arrayOf(1, 20, -3, 4, 5, -9)