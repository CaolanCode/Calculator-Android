package com.caolancode.calculator.view

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.caolancode.calculator.R

@Composable
fun CalculatorButton(
    content: String,
    modifier: Modifier
) {
    if (stringResource(id = R.string.operators).contains(content)) {
        Button(
            modifier = modifier
                .height(dimensionResource(id = R.dimen.button_height))
                .padding(dimensionResource(id = R.dimen.button_padding)),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.dark_button)
            ),
            onClick = {

            }
        ) {
            Text(
                text = content,
                color = colorResource(id = R.color.orange_50),
                fontSize = dimensionResource(id = R.dimen.operator_font_size).value.sp
            )
        }
    } else {
        Button(
            modifier = modifier
                .height(dimensionResource(id = R.dimen.button_height))
                .padding(dimensionResource(id = R.dimen.button_padding)),
            onClick = {

            },
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.gray_button)
            )
        ) {
            Text(
                text = content,
                color = Color.White,
                fontSize = dimensionResource(id = R.dimen.number_font_size).value.sp
            )
        }
    }
}