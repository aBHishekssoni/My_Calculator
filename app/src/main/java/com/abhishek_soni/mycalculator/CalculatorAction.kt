package com.abhishek_soni.mycalculator

sealed class CalculatorAction{
    data class Number(val Number:Int): CalculatorAction()
    object Clear : CalculatorAction()
    object Delete : CalculatorAction()
    object Decimal : CalculatorAction()
    object Calculate : CalculatorAction()
    data class Operation(val operation: CalculatorOperation): CalculatorAction()

}