package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double res;
        String s = null;
        Scanner in = new Scanner(System.in);
        System.out.println("_______" + "Введите первое значение" + "______");
        int b = in.nextInt();
        System.out.println("_______" + "Введите знак" + "______");
        String a=in.next();
        System.out.println("_______" + "Введите второе значение" + "______");
        int c = in.nextInt();
        switch (a) {
            case "+":
                res = b + c;
                break;
            case "-":
                res = b - c;
                break;
            case "*":
                res = b * c;
                break;
            case "/":
                res = b / c;
                break;
            //res - результат на вывод    

            default:
                throw new IllegalStateException("Unexpected value: " + a);
        }
        System.out.println(res);
    }
}
