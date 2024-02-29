package com.tn;

public class Student {
    public int bai1(int n) {
        int sum1 = 0;
        for (int i = 1; i <= n; i++) {
            sum1 += i;
        }

        return sum1;
    }

    public int bai2(int n) {
        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            sum2 += i*i;
        }

        return sum2;
    }

    public double bai3(int n) {
        double sum3 = 0;
        for (int i = 1; i <= n; i++) {
            sum3 = sum3 + 1.0/i;
        }

        return sum3;
    }
}
