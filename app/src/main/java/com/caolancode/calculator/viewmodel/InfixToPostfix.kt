package com.caolancode.calculator.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

class InfixToPostfix {

    private fun precedence(ch: Char): Int =  when (ch) {
        '+', '-' -> 1
        'x', '÷' -> 2
        '^' -> 3
        else -> -1
    }

    private fun notNumeric(ch: Char): Boolean = when (ch) {
        '+', '-', 'x', '÷', '^', '(', ')' -> true
        else -> false
    }

    private fun associativity(ch: Char): Char = when (ch) {
        '^' -> 'R'
        else -> 'L'
    }

    fun postfixConversion(equation: MutableState<String>): MutableState<String> {
        val postfix = mutableStateOf("")
        val stack = ArrayDeque<Char>()
        for (ch in equation.value) {
            if (!notNumeric(ch)) {
                postfix.value += ch
            } else if (ch == '(') {
                stack.add(ch)
            } else if (ch == ')') {
                while (
                    stack.isNotEmpty() &&
                    stack.lastOrNull() != '('
                ) {
                    postfix.value += stack.removeLastOrNull()
                }
                stack.removeLastOrNull() // remove '('
            } else {
                while (
                    stack.isNotEmpty() &&
                    precedence(ch) <= precedence(stack.last()) &&
                    associativity(ch) == 'L'
                ) {
                    postfix.value += stack.removeLastOrNull()
                }
                stack.add(ch)
            }
        }
        while(stack.isNotEmpty()) {
            postfix.value += stack.removeLastOrNull()
        }
        return postfix
    }
}