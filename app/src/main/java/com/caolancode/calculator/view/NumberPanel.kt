package com.caolancode.calculator.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.caolancode.calculator.viewmodel.CalculatorViewModel

@Composable
fun NumberPanel(
    calculatorViewModel: CalculatorViewModel
) {
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
                    .weight(1f),
                onClick = { calculatorViewModel.delete()}
            )
            CalculatorButton(
                content = "C",
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.clear()}
            )
        }
        Row {
            CalculatorButton(
                content = "%",
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("%")}
            )
            CalculatorButton(
                content = "(",
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("(")}
            )
            CalculatorButton(
                content = ")",
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append(")")}
            )
            CalculatorButton(
                content = "÷",
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("÷")}
            )
        }
        Row {
            CalculatorButton(
                content = "7",
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("7")}
            )
            CalculatorButton(
                content = "8",
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("8")}
            )
            CalculatorButton(
                content = "9",
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("9")}
            )
            CalculatorButton(
                content = "x",
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("x")}
            )
        }
        Row {
            CalculatorButton(
                content = "4",
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("4")}
            )
            CalculatorButton(
                content = "5",
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("5")}
            )
            CalculatorButton(
                content = "6",
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("6")}
            )
            CalculatorButton(
                content = "-",
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("-")}
            )
        }
        Row {
            CalculatorButton(
                content = "1",
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("1")}
            )
            CalculatorButton(
                content = "2",
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("2")}
            )
            CalculatorButton(
                content = "3",
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("3")}
            )
            CalculatorButton(
                content = "+",
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("+")}
            )
        }
        Row {
            CalculatorButton(
                content = "0",
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("0")}
            )
            CalculatorButton(
                content = ".",
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append(".")}
            )
            CalculatorButton(
                content = "=",
                modifier = Modifier
                    .weight(2f),
                onClick = { }
            )
        }
    }
}