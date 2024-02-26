package com.caolancode.calculator.viewmodel

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CalculatorViewModel: ViewModel() {
    val equation = mutableStateOf("")
    val infixToPostfix = InfixToPostfix()
    fun append(input: String) {
        val operators = "+-x÷"
        if (equation.value.isNotEmpty()) {
            if (operators.contains(input) && operators.contains(equation.value.last())) {
                return
            }
        }
        if (input == ".") {
            if (equation.value.isEmpty() || operators.contains(equation.value.last())) {
                equation.value += "0"
            }
        }
        equation.value += input
    }

    fun clear() {
        equation.value = ""
    }

    fun delete() {
        if (equation.value.isNotEmpty()) {
            equation.value = equation.value.dropLast(1)
        }
    }

    fun calculate() {
        val postfix: MutableState<String> = infixToPostfix.postfixConversion(equation)
        Log.d("TAG", "calculate: ${postfix.value}")
    }
}