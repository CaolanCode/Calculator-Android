package com.caolancode.calculator.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel

class CalculatorViewModel: ViewModel() {
    private val equation = mutableStateOf("")
    fun append(char: String) {
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