package com.caolancode.calculator.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.caolancode.calculator.R

@Composable
fun EquationDisplay(
    equation: MutableState<String>
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(dimensionResource(id = R.dimen.equation_padding)),
        horizontalAlignment = Alignment.End
    ) {
        if (equation.value == "") {
            Text(
                text = "0",
                style = TextStyle(fontSize = dimensionResource(id = R.dimen.equation_font_size).value.sp)
            )
        } else {
            Text(
                text = equation.value,
                style = TextStyle(fontSize = dimensionResource(id = R.dimen.equation_font_size).value.sp)
            )
        }

    }
}