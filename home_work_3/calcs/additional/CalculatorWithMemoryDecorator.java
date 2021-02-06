package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private ICalculator obj;
    private int counter;
    private double lastOperation;
    private Double memory;


    public CalculatorWithMemoryDecorator(ICalculator obj) {
        this.obj = obj;
    }

    public long getCountOperation() {
        return this.counter;
    }

    @Override
    public double division(double dividend, double divider) {
        counter++;
        lastOperation = this.obj.division(dividend, divider);
        return this.obj.division(dividend, divider);

    }

    @Override
    public double multiplication(double factorA, double factorB) {
        counter++;
        lastOperation = this.obj.multiplication(factorA, factorB);
        return this.obj.multiplication(factorA, factorB);
    }

    @Override
    public double subtraction(double minuend, double subtrahend) {
        counter++;
        lastOperation = this.obj.subtraction(minuend, subtrahend);
        return this.obj.subtraction(minuend, subtrahend);
    }

    @Override
    public double addition(double termA, double termB) {
        counter++;
        lastOperation = this.obj.addition(termA, termB);
        return this.obj.addition(termA, termB);
    }

    @Override
    public double power(double base, int index) {
        counter++;
        lastOperation = this.obj.power(base, index);
        return this.obj.power(base, index);
    }

    @Override
    public double module(double num) {
        counter++;
        lastOperation = this.obj.module(num);
        return this.obj.module(num);
    }

    @Override
    public double sqrt(double num) {
        counter++;
        lastOperation = this.obj.sqrt(num);
        return this.obj.sqrt(num);
    }

    public void writeLastMethodResult() {
        memory = lastOperation;
    }

    public double getMemory() {
        double temp = memory;
        memory = null;
        return temp;

    }

    public ICalculator getCalculator() {
        return this.obj;
    }
}
