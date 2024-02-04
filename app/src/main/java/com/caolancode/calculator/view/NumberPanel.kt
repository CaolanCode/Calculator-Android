package com.caolancode.calculator.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.caolancode.calculator.R
import com.caolancode.calculator.view.CalculatorButton

@Composable
fun NumberPanel() {
    Column {
        Row {
            SettingButton()
            DeleteButton()
            CalculatorButton(content = "C")
            CalculatorButton(content = "÷")
        }
        Row {
            CalculatorButton(content = "%")
            CalculatorButton(content = "(")
            CalculatorButton(content = ")")
            CalculatorButton(content = "x")
        }
        Row {
            CalculatorButton(content = "7")
            CalculatorButton(content = "8")
            CalculatorButton(content = "9")
            CalculatorButton(content = "-")
        }
        Row {
            CalculatorButton(content = "4")
            CalculatorButton(content = "5")
            CalculatorButton(content = "6")
            CalculatorButton(content = "+")
        }
        Row {
            CalculatorButton(content = "1")
            CalculatorButton(content = "2")
            CalculatorButton(content = "3")
            CalculatorButton(content = "=")
        }
        Row {
            CalculatorButton(content = "0")
            CalculatorButton(content = ".")
        }
    }
}