package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        double result = calculator.addition(calculator.addition(4.1, calculator.multiplication(15, 7)),
                calculator.power(calculator.division(28, 5), 2));
        System.out.println(result); //140.45999999999998
    }
}
