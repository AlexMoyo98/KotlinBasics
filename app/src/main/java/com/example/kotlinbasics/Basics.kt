package com.example.kotlinbasics

fun main() {
    var daisy = Dog()
}

fun askCoffeeDetails() {
    println("Who is this coffee for?")
    val name = readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()
    makeCoffee(sugarCountInt, name)
}

fun makeCoffee(sugarCount: Int, name: String) {

    if (sugarCount == 1) {
        println("Coffee with 1 spoon of sugar for $name")
    } else if (sugarCount == 0) {
        println("Coffee with no spoon of sugar for $name")
    } else {
        println("Coffee with $sugarCount spoons of sugar for $name")
    }
}
