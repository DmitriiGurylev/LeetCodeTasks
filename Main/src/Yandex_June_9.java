package src;

import java.util.Scanner;

public class Yandex_June_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        System.out.println(equations(a,b,c,d,e,f));
    }
    public static String equations(int a, int b, int c, int d, int e, int f) {
        if (a==0 && c==0 && b!=0 && d!=0){
            float y1 = (float)e/b;
            float y2 = (float)f/d;
            return y1==y2 ? "4 "+y1 : "0" ;
        }
        else if (b==0 && d==0 && a!=0 && c!=0){
            float x1 = (float)e/a;
            float x2 = (float)f/c;
            return x1==x2 ? "3 "+x1 : "0" ;
        }
        else if (a==0 && b!=0 && c!=0 && d!=0) {
            float y1 = (float)e/b;
            float x2 = (f-d*y1) / c;
            return "2 "+x2+" "+y1;
        }
        else if (a!=0 && b==0 && c!=0 && d!=0) {
            float x1 = (float)e/a;
            float y2 = (f-c*x1) / d;
            return "2 "+x1+" "+y2;
        }
        else if (a!=0 && b!=0 && c==0 && d!=0) {
            float y2 = (float)f/d;
            float x1 = (e-b*y2) / a;
            return "2 "+x1+" "+y2;
        }
        else if (a!=0 && b!=0 && c!=0 && d==0) {
            float x2 = (float)f/c;
            float y1 = (e-a*x2) / b;
            return "2 "+x2+" "+y1;
        }
        else if (a==0 && b!=0 && c!=0 && d==0) {
            float y1 = (float)e/b;
            float x2 = (float)f/c;
            return "2 "+x2+" "+y1;
        }
        else if (a!=0 && b==0 && c==0 && d!=0) {
            float x1 = (float)e/a;
            float y2 = (float)f/d;
            return "2 "+x1+" "+y2;
        }
        else if (a==0 && b==0 && c!=0 && d!=0) {
            return (e!=0) ? "0" : "1"+(-c/d)+" "+f/d;
        }
        else if (a!=0 && b!=0 && c==0 && d==0) {
            return (f!=0) ? "0" : "1"+(-a/b)+" "+e/b;
        }
        else if (a!=0 && b==0 && c==0 && d==0) {
            return (f!=0) ? "0" : "3"+e/a;
        }
        else if (a==0 && b!=0 && c==0 && d==0) {
            return (f!=0) ? "0" : "4"+e/b;
        }
        else if (a==0 && b==0 && c!=0 && d==0) {
            return (e!=0) ? "0" : "3"+f/c;
        }
        else if (a==0 && b==0 && c==0 && d!=0) {
            return (e!=0) ? "0" : "4"+f/d;
        }
        else if (a==0 && b==0 && c==0 && d==0) {
            return (e==0 & f==0) ? "5" : "0";
        }
        else if (e==0 && f==0){
            return "5";
        }
        else {
            if ((d-c*b/a) == 0) return "1 "+(-a/b)+" "+e/b;
            float y = (float) (f - c*e/a) / (d-(float)c*b/a);
            float x = (e-b*y)/a;
            return "2 "+x+" "+y;
        }
    }
}