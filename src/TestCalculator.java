class Calculator {

    public static int add(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public static int substract(int numOne, int numTwo) {
        if(numTwo > numOne) return numTwo - numOne;
            return numOne - numTwo;
    }

    public static int multiply(int numOne, int numTwo) {
        return numOne * numTwo;
    }

    public static int divide(int numOne, int numTwo) {
        if(numTwo == 0) return numTwo/ numOne;
        return numOne / numTwo;
    }

}

public class TestCalculator extends Calculator {

    public static void main(String args[]) throws Exception {

        if(add(10, 20) != 30) throw new Exception("Exception");

        if(substract(20, 10) != 10) throw new Exception("Exception");

        if(multiply(10, 20) != 200) throw new Exception("Exception");

        if(divide(10, 5) != 2) throw new Exception("Exception");
    }


}
