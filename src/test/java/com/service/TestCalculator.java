package com.service;

public class TestCalculator {

    public static void main(String[] args) {

        String exceptionMessage = "Unexpected result";

        Calculator calc = new Calculator(1, 1);

        if(calc.add() != 2) throw new AssertionError(exceptionMessage);

        if(calc.subtract() != 0) throw new AssertionError(exceptionMessage);

        if(calc.multiply() != 1) throw new AssertionError(exceptionMessage);

        if(calc.divide() != 1) throw new AssertionError(exceptionMessage);
    }


}
