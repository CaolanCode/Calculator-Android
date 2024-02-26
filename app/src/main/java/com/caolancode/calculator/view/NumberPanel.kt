package com.caolancode.calculator.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.caolancode.calculator.R
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
                content = stringResource(id = R.string.clear),
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.clear()}
            )
        }
        Row {
            CalculatorButton(
                content = stringResource(id = R.string.power),
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("^")}
            )
            CalculatorButton(
                content = stringResource(id = R.string.open_bracket),
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("(")}
            )
            CalculatorButton(
                content = stringResource(id = R.string.closed_bracket),
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append(")")}
            )
            CalculatorButton(
                content = stringResource(id = R.string.divide),
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("÷")}
            )
        }
        Row {
            CalculatorButton(
                content = stringResource(id = R.string.seven),
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("7")}
            )
            CalculatorButton(
                content = stringResource(id = R.string.eight),
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("8")}
            )
            CalculatorButton(
                content = stringResource(id = R.string.nine),
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("9")}
            )
            CalculatorButton(
                content = stringResource(id = R.string.multiply),
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("x")}
            )
        }
        Row {
            CalculatorButton(
                content = stringResource(id = R.string.four),
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("4")}
            )
            CalculatorButton(
                content = stringResource(id = R.string.five),
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("5")}
            )
            CalculatorButton(
                content = stringResource(id = R.string.six),
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("6")}
            )
            CalculatorButton(
                content = stringResource(id = R.string.minus),
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("-")}
            )
        }
        Row {
            CalculatorButton(
                content = stringResource(id = R.string.one),
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("1")}
            )
            CalculatorButton(
                content = stringResource(id = R.string.two),
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("2")}
            )
            CalculatorButton(
                content = stringResource(id = R.string.three),
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("3")}
            )
            CalculatorButton(
                content = stringResource(id = R.string.add),
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("+")}
            )
        }
        Row {
            CalculatorButton(
                content = stringResource(id = R.string.zero),
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append("0")}
            )
            CalculatorButton(
                content = stringResource(id = R.string.dot),
                modifier = Modifier
                    .weight(1f),
                onClick = { calculatorViewModel.append(".")}
            )
            CalculatorButton(
                content = stringResource(id = R.string.equal),
                modifier = Modifier
                    .weight(2f),
                onClick = { calculatorViewModel.calculate() }
            )
        }
    }
}