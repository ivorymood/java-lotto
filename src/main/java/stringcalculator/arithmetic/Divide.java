package stringcalculator.arithmetic;

public class Divide implements ArithmeticOperation {

    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

}
