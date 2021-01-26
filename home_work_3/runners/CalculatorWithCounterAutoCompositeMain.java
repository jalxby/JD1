package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

import java.io.Console;

public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite(calculatorWithMathCopy);
        double result = calculator.additionClwc(calculator.additionClwc(4.1, calculator.multiplicationClwc(15, 7)),
                calculator.powerClwc(calculator.divisionClwc(28, 5), 2));
        System.out.println(result); //140.45999999999998
        System.out.println(calculator.getCountOperation());
    }
}
