package com.caolancode.calculator.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun NumberPanel() {
    Column(
        verticalArrangement = Arrangement.Bottom
    ) {
        Row {
            SettingButton(
                modifier = Modifier
                    .weight(2f)
            )
            DeleteButton(
                modifier = Modifier
                    .weight(1f)
            )
            CalculatorButton(
                content = "C",
                modifier = Modifier
                    .weight(1f)
            )
        }
        Row {
            CalculatorButton(
                content = "%",
                modifier = Modifier
                    .weight(1f)
            )
            CalculatorButton(
                content = "(",
                modifier = Modifier
                    .weight(1f)
            )
            CalculatorButton(
                content = ")",
                modifier = Modifier
                    .weight(1f)
            )
            CalculatorButton(
                content = "÷",
                modifier = Modifier
                    .weight(1f)
            )
        }
        Row {
            CalculatorButton(
                content = "7",
                modifier = Modifier
                    .weight(1f)
            )
            CalculatorButton(
                content = "8",
                modifier = Modifier
                    .weight(1f)
            )
            CalculatorButton(
                content = "9",
                modifier = Modifier
                    .weight(1f)
            )
            CalculatorButton(
                content = "x",
                modifier = Modifier
                    .weight(1f)
            )
        }
        Row {
            CalculatorButton(
                content = "4",
                modifier = Modifier
                    .weight(1f)
            )
            CalculatorButton(
                content = "5",
                modifier = Modifier
                    .weight(1f)
            )
            CalculatorButton(
                content = "6",
                modifier = Modifier
                    .weight(1f)
            )
            CalculatorButton(
                content = "-",
                modifier = Modifier
                    .weight(1f)
            )
        }
        Row {
            CalculatorButton(
                content = "1",
                modifier = Modifier
                    .weight(1f)
            )
            CalculatorButton(
                content = "2",
                modifier = Modifier
                    .weight(1f)
            )
            CalculatorButton(
                content = "3",
                modifier = Modifier
                    .weight(1f)
            )
            CalculatorButton(
                content = "+",
                modifier = Modifier
                    .weight(1f)
            )
        }
        Row {
            CalculatorButton(
                content = "0",
                modifier = Modifier
                    .weight(1f)
            )
            CalculatorButton(
                content = ".",
                modifier = Modifier
                    .weight(1f)
            )
            CalculatorButton(
                content = "=",
                modifier = Modifier
                    .weight(2f)
            )
        }
    }
}