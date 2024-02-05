package com.caolancode.calculator.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CalculatorViewModel: ViewModel() {
    val equation = mutableStateOf("")
    fun append(input: String) {
        val operators = "+-x÷"
        if (equation.value != "") {
            if (operators.contains(input) && operators.contains(equation.value.last())) {
                return
            }
        }
        if (input == ".") {
            if (equation.value == "" || operators.contains(equation.value.last())) {
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
}