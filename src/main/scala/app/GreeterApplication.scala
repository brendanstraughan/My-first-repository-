package app

import scala.io.StdIn

object GreeterApplication extends App {


    val input = StdIn.readLine("what is your name\n")

    val x = new Person(name = input)
    val y = new Person("Ramin")

    println(x.speak())
    println(y.speak())




}