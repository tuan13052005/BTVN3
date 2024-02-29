package com.tn;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean is = false;
        while (!is){
            System.out.print("Nhap so n: ");
            n = sc.nextInt();
            if (n > 0)
                is = true;
            else {
                System.out.println("Hay nhap lai");
                is = false;
            }
        }

        Student student = new Student();
        int sum1 = student.bai1(n);
        System.out.println("Sum1: " + sum1 + "\n");

        int sum2 = student.bai2(n);
        System.out.println("Sum2: " + sum2 + "\n");

        double sum3 = student.bai3(n);
        System.out.println("Sum3: " + sum3);
    }
}
