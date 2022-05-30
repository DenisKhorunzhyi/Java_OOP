package Task_3.second;

import Task_3.first.Minus;
import Task_3.first.Numerable;

public class MyCalc implements Numerable {
    @Override
    public double Add(double a, double b) {
        return a+b;
    }

    @Override
    public double minus(double a, double b) {
        return a-b;
    }

    @Override
    public double devide(double a, double b) {
        return a/b;
    }

    @Override
    public double multiply(double a, double b) {
        return a*b;
    }
}
