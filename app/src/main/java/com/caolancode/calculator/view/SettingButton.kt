package com.caolancode.calculator.view

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.caolancode.calculator.R

@Composable
fun SettingButton() {
    Button(
        onClick = {

        }
    ) {
        Icon(
            Icons.Default.Settings,
            contentDescription = stringResource(id = R.string.settings_description)
        )
    }
}