package app

import scala.io.StdIn

object GreeterApplication extends App {

        def greet(name: String) = println(s"Hello $name")

        val name = StdIn.readLine("what is your name\n")

    greet(name)

    }

