package com.abhishek_soni.mycalculator

sealed class CalculatorOperation(val symbol: String){
    object Add: CalculatorOperation("+")
    object Substrct: CalculatorOperation("-")
    object multiply: CalculatorOperation("x")
    object Divide: CalculatorOperation("/")
    data class Operation(val operation: CalculatorOperation): CalculatorAction()
}