package com.caolancode.calculator.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.caolancode.calculator.R
import com.caolancode.calculator.viewmodel.CalculatorViewModel

@Composable
fun CalculatorUI(
    modifier: Modifier,
    calculatorViewModel: CalculatorViewModel
) {
    Column(
        modifier = modifier
            .padding(dimensionResource(id = R.dimen.full_view_padding))
    ) {
        ResultDisplay(calculatorViewModel.result)
        Spacer(modifier = modifier.weight(1f))
        EquationDisplay(calculatorViewModel.equation)
        Spacer(modifier = modifier.weight(1f))
        NumberPanel(calculatorViewModel)
    }
}