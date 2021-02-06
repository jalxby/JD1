package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoCompositeInterface{
    private ICalculator obj;
    private int counter;

    public CalculatorWithCounterAutoCompositeInterface(ICalculator obj) {
        this.obj = obj;
    }

    public long getCountOperation() {
        return this.counter;
    }


    public double division(double dividend, double divider) {

        counter++;
        return this.obj.division(dividend, divider);

    }


    public double multiplication(double factorA, double factorB) {
        counter++;
        return this.obj.multiplication(factorA, factorB);
    }


    public double subtraction(double minuend, double subtrahend) {
        counter++;
        return this.obj.subtraction(minuend, subtrahend);
    }


    public double addition(double termA, double termB) {
        counter++;
        return this.obj.addition(termA, termB);
    }


    public double power(double base, int index) {
        counter++;
        return this.obj.power(base, index);
    }


    public double module(double num) {
        counter++;
        return this.obj.module(num);
    }


    public double sqrt(double num) {
        counter++;
        return this.obj.sqrt(num);
    }
}
