package com.caolancode.calculator.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.caolancode.calculator.R

@Composable
fun DeleteButton(
    modifier: Modifier
) {
    Button(
        modifier = modifier
            .height(dimensionResource(id = R.dimen.button_height))
            .padding(dimensionResource(id = R.dimen.button_padding)),
        onClick = {

        }
    ) {
        Icon(
            painter = painterResource(id = R.drawable.baseline_backspace_24),
            contentDescription = stringResource(id = R.string.backspace_description)
        )
    }
}