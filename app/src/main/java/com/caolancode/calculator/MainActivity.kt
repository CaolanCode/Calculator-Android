package com.caolancode.calculator

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.Observer
import com.caolancode.calculator.view.CalculatorUI
import com.caolancode.calculator.view.theme.CalculatorTheme
import com.caolancode.calculator.viewmodel.CalculatorViewModel

class MainActivity : ComponentActivity() {
    private var calculatorViewModel = CalculatorViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CalculatorUI(
                        modifier = Modifier,
                        calculatorViewModel
                    )
                }
            }
        }
        observe()
    }

    private fun observe() {
        calculatorViewModel.divideZeroError.observe(this) {
            if (it == true) {
                Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
