package com.caolancode.calculator.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.caolancode.calculator.R

@Composable
fun SettingButton(modifier: Modifier) {
    Button(
        modifier = modifier
            .height(dimensionResource(id = R.dimen.button_height))
            .padding(dimensionResource(id = R.dimen.button_padding)),
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(id = R.color.dark_button)
        ),
        onClick = {

        }
    ) {
        Icon(
            Icons.Default.Settings,
            contentDescription = stringResource(id = R.string.settings_description),
            modifier = modifier.size(dimensionResource(id = R.dimen.icon_size)),
            tint = colorResource(id = R.color.yellow_50)
        )
    }
}