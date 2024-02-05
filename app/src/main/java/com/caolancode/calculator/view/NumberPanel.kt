package com.caolancode.calculator.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.caolancode.calculator.R
import com.caolancode.calculator.view.CalculatorButton

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