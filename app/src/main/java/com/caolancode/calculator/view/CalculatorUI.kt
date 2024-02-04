package com.caolancode.calculator.view

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

@Composable
fun CalculatorUI() {
    Column {
        ResultDisplay()
        EquationDisplay()
        NumberPanel()
    }
}