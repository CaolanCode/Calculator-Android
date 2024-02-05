package com.caolancode.calculator.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.caolancode.calculator.R

@Composable
fun CalculatorUI(
    modifier: Modifier
) {
    Column(
        modifier = modifier
            .padding(dimensionResource(id = R.dimen.full_view_padding))
    ) {
        ResultDisplay()
        Spacer(modifier = modifier.weight(1f))
        EquationDisplay()
        Spacer(modifier = modifier.weight(1f))
        NumberPanel()
    }
}