package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    public double power(double base, int index) {
        return Math.pow(base, index);
    }

    public double module(double num) {
        return Math.abs(num);
    }

    public double sqrt(double num) {
        return Math.sqrt(num);
    }
}
