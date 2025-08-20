package org.example;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a ,int b){
        return a-b;
    }
    public double circleArea(double a){
        if (a>=0) {
            return  (Math.PI * a * a);
        }else{
            throw new IllegalArgumentException("半徑不可為負");
        }
    }
}
