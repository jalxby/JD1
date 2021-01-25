package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithMemory calculator = new CalculatorWithMemory(calculatorWithMathCopy);
        double result = calculator.addition(calculator.addition(4.1, calculator.multiplication(15, 7)),
                calculator.power(calculator.division(28, 5), 2));
        System.out.println(result); //140.45999999999998
        System.out.println(calculator.getCountOperation());
        calculator.writeLastMethodResult();
        System.out.println(calculator.getMemory());

    }
}
