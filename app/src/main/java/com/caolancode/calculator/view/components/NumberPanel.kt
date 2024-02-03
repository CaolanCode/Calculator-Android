package com.caolancode.calculator.view.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.caolancode.calculator.R

@Composable
fun NumberPanel() {
    Row {
        Column {
            Row {
                Button(
                    onClick = {

                    }
                ) {
                    Icon(
                        Icons.Default.Settings,
                        contentDescription = stringResource(id = R.string.settings_description))
                }
                Button(
                    onClick = {

                    }
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_backspace_24),
                        contentDescription = stringResource(id = R.string.backspace_description)
                    )
                }
                CalculatorButton(content = "C")
            }
            Row {
                CalculatorButton(content = "%")
                CalculatorButton(content = "(")
                CalculatorButton(content = ")")
            }
            Row {
                CalculatorButton(content = "7")
                CalculatorButton(content = "8")
                CalculatorButton(content = "9")
            }
            Row {
                CalculatorButton(content = "4")
                CalculatorButton(content = "5")
                CalculatorButton(content = "6")
            }
            Row {
                CalculatorButton(content = "1")
                CalculatorButton(content = "2")
                CalculatorButton(content = "3")
            }
            Row {
                CalculatorButton(content = "0")
                CalculatorButton(content = ".")
            }
        }
        Column {
            CalculatorButton(content = "÷")
            CalculatorButton(content = "x")
            CalculatorButton(content = "-")
            CalculatorButton(content = "+")
            CalculatorButton(content = "=")
        }
    }

}