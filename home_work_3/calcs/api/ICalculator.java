package home_work_3.calcs.api;

public interface ICalculator {
    double division(double dividend, double divider);

    double multiplication(double factorA, double factorB);

    double subtraction(double minuend, double subtrahend);

    double addition(double termA, double termB);

    double power(double base, int index);

    double module(double num);

    double sqrt(double num);
}
