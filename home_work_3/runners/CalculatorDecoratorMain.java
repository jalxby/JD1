package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator calculator =
                new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        double result = calculator.addition(calculator.addition(4.1, calculator.multiplication(15, 7)),
                calculator.power(calculator.division(28, 5), 2));
        System.out.println(result); //140.45999999999998
        CalculatorWithCounterAutoDecorator calc = (CalculatorWithCounterAutoDecorator) calculator;
        CalculatorWithMemoryDecorator calcWithMemory = (CalculatorWithMemoryDecorator) calc.getCalculator();
        System.out.println(calc.getCountOperation());
        calcWithMemory.writeLastMethodResult();
        System.out.println(calcWithMemory.getMemory());
    }
}
