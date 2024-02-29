package com.caolancode.calculator.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableDoubleState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.caolancode.calculator.R

@Composable
fun ResultDisplay(
    result: MutableDoubleState
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(dimensionResource(id = R.dimen.equation_padding)),
        horizontalAlignment = Alignment.End
    ) {
        if (result.doubleValue == 0.0) {
            Text(
                text = "0",
                style = TextStyle(fontSize = dimensionResource(id = R.dimen.result_font_size).value.sp)
            )
        } else {
            Text(
                text = result.doubleValue.toString(),
                style = TextStyle(fontSize = dimensionResource(id = R.dimen.result_font_size).value.sp)
            )
        }
    }
}