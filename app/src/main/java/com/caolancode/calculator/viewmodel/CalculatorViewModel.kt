package com.caolancode.calculator.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.math.pow

class CalculatorViewModel: ViewModel() {
    val equation = mutableStateOf("")
    private val infixToPostfix = InfixToPostfix()
    val result = mutableDoubleStateOf(0.0)
    var divideZeroError = MutableLiveData<Boolean?>()
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
        val stack = ArrayDeque<Double>()
        val parts = postfix.value.split(" ")
        for(part in parts) {
            if(part.toIntOrNull() != null || part.toDoubleOrNull() != null) {
                stack.add(part.toDouble())
            } else {
                val num2 = stack.removeLast()
                val num1 = stack.removeLast()
                when (part) {
                    "+" -> stack.add(num1 + num2)
                    "-" -> stack.add(num1 - num2)
                    "x" -> stack.add(num1 * num2)
                    "÷" -> if (num2 == 0.0) {
                        equation.value = ""
                        divideZeroError.value = true
                        return
                    } else {
                        stack.add(num1 / num2)
                    }
                    "^" -> stack.add(num1.pow(num2))
                }
            }
        }
        result.doubleValue = stack.removeLast()
    }
}