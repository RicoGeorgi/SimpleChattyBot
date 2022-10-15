package bot

import java.util.Scanner

const val NAME: String = "Chatty"
const val CREATION: String = "2022"

fun main() {

    val scanner = Scanner(System.`in`)

    println("Hello! My name is $NAME.")
    println("I was created in $CREATION.")
    println("Please, remind me your name.")

    val userName: String = scanner.next()

    println("What a great name you have, $userName!")

}