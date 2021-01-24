package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoInterface implements ICalculator {
    ICalculator obj;
    int counter;

    public CalculatorWithCounterAutoInterface(ICalculator obj) {
        this.obj = obj;
    }

    public long getCountOperation() {
        return this.counter;
    }

    @Override
    public double division(double dividend, double divider) {

        counter++;
        return this.obj.division(dividend, divider);

    }

    @Override
    public double multiplication(double factorA, double factorB) {
        counter++;
        return this.obj.multiplication(factorA, factorB);
    }

    @Override
    public double subtraction(double minuend, double subtrahend) {
        counter++;
        return this.obj.subtraction(minuend, subtrahend);
    }

    @Override
    public double addition(double termA, double termB) {
        counter++;
        return this.obj.addition(termA, termB);
    }

    @Override
    public double power(double base, int index) {
        counter++;
        return this.obj.power(base, index);
    }

    @Override
    public double module(double num) {
        counter++;
        return this.obj.module(num);
    }

    @Override
    public double sqrt(double num) {
        counter++;
        return this.obj.sqrt(num);
    }
}
