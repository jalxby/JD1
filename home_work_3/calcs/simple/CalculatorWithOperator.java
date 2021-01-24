package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
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
        double result = 1;
        if (base < 0) {
            System.out.println("возвести в степень можно только положительные дробные числа");
            return -1;
        } else {
            for (int i = 0; i < index; i++) {
                result = result * base;
            }
            return result;
        }
    }

    public double module(double num) {
        if (num < 0)
            return -num;
        else
            return num;
    }

    public double sqrt(double num) {
        return Math.pow(Math.E, Math.log(num) / 2);
    }
}
