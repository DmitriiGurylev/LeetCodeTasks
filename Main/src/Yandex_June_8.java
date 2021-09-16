package src;

import java.util.Scanner;

public class Yandex_June_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        System.out.println(bricks(a,b,c,d,e));
    }
    public static String bricks(int a, int b, int c, int d, int e) {
        int min1, min2;
        if (a>=b && a>=c){
            min1 = b;
            min2 = c;
        }
        else if (b>=a && b>=c){
            min1 = a;
            min2 = c;
        }
        else{
        min1 = a;
        min2 = b;
        }
        int minOfBrick = Math.min(min1,min2);
        int maxOfBrick = Math.max(min1,min2);
        int minOfHole = Math.min(d,e);
        int maxOfHole = Math.max(d,e);
        return ( minOfBrick <= minOfHole && maxOfBrick <= maxOfHole ) ? "YES" : "NO";
    }
}