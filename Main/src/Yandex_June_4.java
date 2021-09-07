package src;

import java.util.Scanner;

public class Yandex_June_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(equation(a,b,c));
    }
    public static String equation(int a, int b, int c){

            if (c<0) return "NO SOLUTION";
            else if (a==0){
                if (b==Math.pow(c,2)) return "MANY SOLUTIONS";
                else return "NO SOLUTION";
            }
            else return ((float)(c*c-b)/a) %1==0 ? (c*c-b)/a+"" : "NO SOLUTION" ;
    }
}
