package com.caolancode.calculator.view.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun UIButton(content: String) {
    Button(
        onClick = {
            
        }
    ) {
      Text(text = content)
    }
}