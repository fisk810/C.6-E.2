package com.company;

public class Main {

    public static void main(String[] args) {
        squareRoot(9);

    }

    public static double squareRoot(double a){
        double x0 = 2.0;
        double x1 = 0.0;
        double temp = x0;

        while(Math.abs(x1 - temp) > 0.0001){
            x1 = (x0 + a/x0) / 2.0;
            temp = x0;
            x0 = x1;
        }
        return x1;
    }
}
