package ru.vsu.sc.berezin_y_a;

public class Main {

    public static void main(String[] args) {

        System.out.println(findFirstSum());
        System.out.println(findSecondSum());

    }

    private static double findFirstSum() {
        double sum1 = 0;
        for (int i = 1; i <= 50; i++) {
            sum1 += 1 / Math.pow(i, 3);
        }
        return sum1;
    }

    private static double findSecondSum() {
        double sum2 = 0;
        for (int i = 2; i <= 128; i += 2) {
            sum2 += 1 / Math.pow(i, 2);
        }
        return sum2;
    }

}
