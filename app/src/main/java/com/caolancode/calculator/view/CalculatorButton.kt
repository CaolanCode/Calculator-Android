package com.caolancode.calculator.view

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun CalculatorButton(content: String) {
    Button(
        onClick = {
            
        }
    ) {
      Text(text = content)
    }
}