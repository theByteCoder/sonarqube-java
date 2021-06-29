package main;

class Calculator {

    int numOne;
    int numTwo;

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

public class TestCalculator {

    public static void main(String[] args) {

        String exceptionMessage = "Unexpected result";

        Calculator calc = new Calculator(1, 1);

        if(calc.add() != 2) throw new AssertionError(exceptionMessage);

        if(calc.substract() != 0) throw new AssertionError(exceptionMessage);

        if(calc.multiply() != 1) throw new AssertionError(exceptionMessage);

        if(calc.divide() != 1) throw new AssertionError(exceptionMessage);
    }


}
