package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    public double division(double dividend, double divider) {
        if (dividend == 0) {
            System.out.println("На ноль делить нельзя!!!");
            return 1;
        } else {
            return dividend / divider;
        }
    }

    public double multiplication(double factorA, double factorB) {
        return factorA * factorB;
    }

    public double subtraction(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }

    public double addition(double termA, double termB) {
        return termA + termB;
    }

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
