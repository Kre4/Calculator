package com.kre4.calculator

sealed class CalculationResult {

    val isSuccessful: Boolean
        get() = this is SuccessfulCalculation

    companion object {
        class SuccessfulCalculation(val answer: String): CalculationResult()
        object ExpressionError: CalculationResult()
        object OperatorsError: CalculationResult()
        object ProhibitedActions: CalculationResult()
        object ZeroDivision: CalculationResult()
    }

}