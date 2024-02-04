package com.caolancode.calculator.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.caolancode.calculator.R

@Composable
fun CalculatorButton(
    content: String,
    modifier: Modifier) {
    Button(
        modifier = modifier
            .height(dimensionResource(id = R.dimen.button_height))
            .padding(dimensionResource(id = R.dimen.button_padding)),
        onClick = {

        }
    ) {
        Text(
            text = content,
            color = Color.White,
            fontSize = dimensionResource(id = R.dimen.button_font_size).value.sp
        )
    }
}