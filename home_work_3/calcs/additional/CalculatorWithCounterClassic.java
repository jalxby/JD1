package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    long counter=0;
    public void incrementCountOperation(){
        counter++;
    }
    public long getCountOperation(){
        return this.counter;
    }
}
