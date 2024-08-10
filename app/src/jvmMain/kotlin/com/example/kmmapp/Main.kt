package com.example.kmmapp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        title = "KmmApp",
        onCloseRequest = ::exitApplication,
    ){
        MainScreen()
    }
}