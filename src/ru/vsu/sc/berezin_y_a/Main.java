package ru.vsu.sc.berezin_y_a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n = readNum("Enter n: ");
        int a = readNum("Enter a: ");
        int b = readNum("Enter b: ");

        System.out.printf("The sum of numbers = %d", findSum(n, a, b));

    }

    private static int findSum(int n, int a, int b) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (checkNum(i, a, b)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean checkNum(int i, int a, int b) {
        return (i % a == 0) && (i % b != 0);
    }

    private static int readNum(String text) {
        System.out.print(text);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num <= 0) {
            System.out.println("Error");
            System.exit(1);
        }
        return num;
    }

}
