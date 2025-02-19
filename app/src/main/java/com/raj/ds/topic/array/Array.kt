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

fun main() {
    println("-------------------------")
    println("Binary Search:")
    binarySearch(arrayOf(1, 2, 3, 4, 5, 6, 7), 7)
    binarySearch(arrayOf(1, 2, 3, 4, 5, 6, 70), 7)
    println("-------------------------")
}