package com.service;

class Calculator {

    int numOne, numTwo;

    Calculator(int numOne, int numTwo) {
        this.numOne = numOne;
        this.numTwo = numTwo;
    }

    public int add() {
        return numOne + numTwo;
    }

    public int substract() {
        if(numTwo > numOne) {
            return numTwo - numOne;
        }
        return numOne - numTwo;
    }

    public int multiply() {
        return numOne * numTwo;
    }

    public int divide() {
        if(numTwo == 0) return numTwo/ numOne;
        return numOne / numTwo;
    }
}
