package ru.craftapps.ecomfilter

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainScreen(){
    BasicText(
        modifier = Modifier
            .background(
                color = Color.White
            )
            .fillMaxSize(),
        text = "Hello World!",
        style = TextStyle(
            color = Color.Black
        )
    )
}

@Preview
@Composable
fun MainScreenPreview(){
    MainScreen()
}