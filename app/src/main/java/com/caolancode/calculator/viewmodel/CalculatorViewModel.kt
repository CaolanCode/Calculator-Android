package com.caolancode.calculator.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CalculatorViewModel: ViewModel() {
    val equation = mutableStateOf("")
    fun append(char: String) {
        if (equation.value != "") {
            val lastNumber = equation.value.last()
            val operators = "+-x÷"
            if (operators.contains(char) && operators.contains(lastNumber)) {
                return
            }
        }
        equation.value += char
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