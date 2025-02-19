package com.raj.ds.topic.array

import kotlin.Array

/**
 * Binary search algorithm
 */
fun binarySearch(array: Array<Int>, item: Int) {
    var mid = array.size / 2
    var start = 0
    var end = array.size - 1
    while (start <= end) {
        if (array[mid] == item) {
            println("Item found $item at index $mid")
            return
        }
        if (array[mid] > item) {
            end = mid - 1
        } else {
            start = mid + 1
        }
        mid = (start + end) / 2
    }
    println("Not found $item")

}

fun reverseArray(array: Array<Int>) {
    for (i in 0 until array.size / 2) {
        // Swap elements at i and array.size - 1 - i
        val temp = array[i]
        array[i] = array[array.size - 1 - i]
        array[array.size - 1 - i] = temp
    }
    array.forEach { i ->
        print("  $i")
    }
    println()
}

fun main() {
    println("-------------------------")
    println("Binary Search:")
    binarySearch(arrayOf(1, 2, 3, 4, 5, 6, 7), 7)
    binarySearch(arrayOf(1, 2, 3, 4, 5, 6, 70), 7)
    println("-------------------------")

    println("Rotate array:")
    reverseArray(arrayOf(1, 2, 3, 4, 5, 6, 7))
    println("-------------------------")

}