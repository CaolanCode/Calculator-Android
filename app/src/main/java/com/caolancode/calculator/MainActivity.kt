package com.caolancode.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.caolancode.calculator.view.CalculatorUI
import com.caolancode.calculator.view.NumberPanel
import com.caolancode.calculator.view.theme.CalculatorTheme
import com.caolancode.calculator.viewmodel.CalculatorViewModel

class MainActivity : ComponentActivity() {
    private lateinit var calculatorViewModel: CalculatorViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        calculatorViewModel = CalculatorViewModel()
        setContent {
            CalculatorTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CalculatorUI(modifier = Modifier, calculatorViewModel)
                }
            }
        }
    }
}


//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    CalculatorTheme {
//        NumberPanel()
//    }
//}