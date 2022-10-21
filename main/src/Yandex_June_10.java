package src;

import java.util.Scanner;

public class Yandex_June_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(equations(a,b,c,d));
    }
    public static String equations(int interval1, int interval2, int count1, int count2) {
        int maxOf1 = count1 + (count1 - 1) * interval1 + 2 * interval1;
        int minOf1 = count1 + (count1 - 1) * interval1;

        int maxOf2 = count2 + (count2 - 1) * interval2 + 2 * interval2;
        int minOf2 = count2 + (count2 - 1) * interval2;

        if (minOf1>maxOf2 || minOf2>maxOf1){
            return  "-1";
        }

        int min = Math.max(minOf1,minOf2);
        int max = Math.min(maxOf1,maxOf2);
        return min + " " + max;
    }
}