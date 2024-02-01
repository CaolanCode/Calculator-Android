package com.caolancode.calculator.view.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.caolancode.calculator.R

@Composable
fun NumberPanel() {
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
        }
    }
}