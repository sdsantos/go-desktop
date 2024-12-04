package org.example.godesktop

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() {
    val greetingLib = loadGreetingLib()
    println(greetingLib.GenerateGreeting("World"))
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "GoDesktop",
        ) {
            App()
        }
    }
}