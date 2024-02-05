package com.caolancode.calculator.view

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.caolancode.calculator.R

@Composable
fun DeleteButton(
    modifier: Modifier,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier
            .height(dimensionResource(id = R.dimen.button_height))
            .padding(dimensionResource(id = R.dimen.button_padding)),
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(id = R.color.dark_button)
        ),
        onClick = onClick
    ) {
        Icon(
            painter = painterResource(id = R.drawable.baseline_backspace_24),
            contentDescription = stringResource(id = R.string.backspace_description),
            modifier = modifier.size(dimensionResource(id = R.dimen.icon_size)),
            tint = colorResource(id = R.color.orange_50)
        )
    }
}