package com.caolancode.calculator.view

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.sp
import com.caolancode.calculator.R

@Composable
fun CalculatorButton(
    content: String,
    modifier: Modifier
) {
    val operators = "+-=x÷C"
    if (operators.contains(content)) {
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
                fontSize = dimensionResource(id = R.dimen.operator_font_size).value.sp
            )
        }
    } else {
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
                fontSize = dimensionResource(id = R.dimen.number_font_size).value.sp
            )
        }
    }
}