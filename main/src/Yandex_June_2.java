package src;

import java.util.Scanner;

public class Yandex_June_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(isTriangle(a,b,c));
    }

    public static String isTriangle(int a, int b, int c) {
        try {
            if (a<=0 || b<=0 || c<=0) throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if ((a+b>c) && (a+c>b) && (b+c>a)) return "YES";
        else return "NO";
    }
}