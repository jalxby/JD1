package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {


    public CalculatorWithOperator clwo;
    public CalculatorWithMathCopy clwc;
    public CalculatorWithMathExtends clwe;
    int counter;

    public long getCountOperation() {
        return counter;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator obj) {
        clwo = obj;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy obj) {
        clwc = obj;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends obj) {
        clwe = obj;
    }

    public double additionClwc(double termA, double termB) {
        counter++;
        return clwc.addition(termA, termB);
    }

    public double additionClwe(double termA, double termB) {
        counter++;
        return clwe.addition(termA, termB);
    }

    public double additionClwo(double termA, double termB) {
        counter++;
        return clwo.addition(termA, termB);
    }

    public double divisionClwc(double termA, double termB) {
        counter++;
        return clwc.division(termA, termB);
    }

    public double divisionClwe(double termA, double termB) {
        counter++;
        return clwe.division(termA, termB);
    }

    public double divisionClwo(double termA, double termB) {
        counter++;
        return clwo.division(termA, termB);
    }

    public double multiplicationClwc(double termA, double termB) {
        counter++;
        return clwc.multiplication(termA, termB);
    }

    public double multiplicationClwe(double termA, double termB) {
        counter++;
        return clwe.multiplication(termA, termB);
    }

    public double multiplicationClwo(double termA, double termB) {
        counter++;
        return clwo.multiplication(termA, termB);
    }

    public double subtractionClwc(double termA, double termB) {
        counter++;
        return clwc.subtraction(termA, termB);
    }

    public double subtractionClwe(double termA, double termB) {
        counter++;
        return clwe.subtraction(termA, termB);
    }

    public double subtractionClwo(double termA, double termB) {
        counter++;
        return clwo.subtraction(termA, termB);
    }

    public double sqrtClwc(double num) {
        counter++;
        return clwc.sqrt(num);
    }

    public double sqrtClwo(double num) {
        counter++;
        return clwo.sqrt(num);
    }

    public double sqrtClwe(double num) {
        counter++;
        return clwe.sqrt(num);
    }

    public double moduleClwc(double num) {
        counter++;
        return clwc.module(num);
    }

    public double moduleClwo(double num) {
        counter++;
        return clwo.module(num);
    }

    public double moduleClwe(double num) {
        counter++;
        return clwe.module(num);
    }

    public double powerClwc(double termA, int termB) {
        counter++;
        return clwc.power(termA, termB);
    }

    public double powerClwe(double termA, int termB) {
        counter++;
        return clwe.power(termA, termB);
    }

    public double powerClwo(double termA, int termB) {
        counter++;
        return clwo.power(termA, termB);
    }
}
