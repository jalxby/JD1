package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    long counter = 0;

    public void incrementCountOperation() {
        counter++;
    }

    public long getCountOperation() {
        return counter;
    }

    @Override
    public double addition(double termA, double termB) {
        incrementCountOperation();
        return super.addition(termA, termB);
    }

    @Override
    public double division(double dividend, double divider) {
        incrementCountOperation();
        return super.division(dividend, divider);
    }

    @Override
    public double multiplication(double factorA, double factorB) {
        incrementCountOperation();
        return super.multiplication(factorA, factorB);
    }

    @Override
    public double subtraction(double minuend, double subtrahend) {
        incrementCountOperation();
        return super.subtraction(minuend, subtrahend);
    }

    @Override
    public double module(double num) {
        incrementCountOperation();
        return super.module(num);
    }

    @Override
    public double power(double base, int index) {
        incrementCountOperation();
        return super.power(base, index);
    }

    @Override
    public double sqrt(double num) {
        incrementCountOperation();
        return super.sqrt(num);
    }
}
