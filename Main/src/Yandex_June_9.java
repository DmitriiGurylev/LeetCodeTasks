package src;

import java.util.Scanner;

public class Yandex_June_9 {
    public static void main(String[] args) {
        System.out.println(equations(1,0,0,1,3,3));
        System.out.println(equations(1,1,2,2,1,2));
        System.out.println(equations(0,2,0,4,1,2));
        System.out.println(equations(2,3,4,6,1,2));
        System.out.println(equations(0,1,0,3,5,15));
        System.out.println(equations(0,0,0,0,0,0));
        System.out.println(equations(0,0,1,1,6,0));
        System.out.println(equations(2,2,2,5,8,8));
        System.out.println(equations(1,1,1,1,1,1));
        System.out.println(equations(0,1,0,1,2,1));
        System.out.println(equations(2,3,4,6,1,1));
        System.out.println(equations(0,-1,-3,0,5,3));
        System.out.println(equations(1,-1,1,1,5,8));
        System.out.println(equations(0,0,0,0,0,0.1f));
        System.out.println(equations(0,0,1,2,0,3));
        System.out.println(equations(0,0,0,2,0,3));


        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float d = scanner.nextFloat();
        float e = scanner.nextFloat();
        float f = scanner.nextFloat();
        System.out.println(equations(a,b,c,d,e,f));
    }
    public static String equations(float a, float b, float c, float d, float e, float f) {
        float newa=0,newb=0,newe=0;
        boolean same = false;
        float ratio = 0;
        
        if (a != 0) {
            ratio = c/a;
        }
        else if (b != 0) {
            ratio = d/b;
        }

        if (a*ratio == c && b*ratio == d){
            if (e*ratio == f) {
                newa = a;
                newb = b;
                newe = e;
                same = true;
            }
            else {
                return "0";
            }
        }

        if (a==0 && b==0 && c==0 && d==0 && e==f && e==0){
            return "5";
        }
        else if (a==0 && b==0 && c==0 && d==0 && e!=f){
            return "0";
        }
        else if ((a==0 && b==0 && e!=0) || (c==0 && d==0 && f!=0)) {
            return "0";
        }

        if (same){
            if (newa==0 && newb!=0){
                float y = newe / newb;
                return "4 "+ (y%1==0 ? ""+(int)y : y);
            }
            else if (newa!=0 && newb==0){
                float x = newe / newa;
                return "3 "+ (x%1==0 ? ""+(int)x : x);
            }
            else if (newa!=0 && newb!=0){
                float k = -newa/newb;
                float bNew = newe/newb;
                return "1 "+ (k%1==0 ? ""+(int)k : k) + " " + (bNew%1==0 ? ""+(int)bNew : bNew);
            }
        }
        else{
            if ((a==0 && c==0) || (b==0 && d==0)){
                return "0";
            }
            else if (a!=0){
                float y = (f-c*e/a) / (d-c*b/a);
                float x = (e-b*y)/a;
                return "2 " + (x%1==0 ? ""+(int)x : x) + " " +(y%1==0 ? ""+(int)y : y);
            }
            else if (b!=0){
                float x = (f-d*e/b) / (c-d*a/b);
                float y = (e-a*x)/b;
                return "2 " + (x%1==0 ? ""+(int)x : x) + " " +(y%1==0 ? ""+(int)y : y);
            }
            else if (a==0 && b==0 && c!=0 && d!=0) {
                return "1 " + ((-c/d)%1==0 ? ""+(int)(-c/d) : (-c/d)) + " " + ((f/d)%1==0 ? ""+(int)(f/d) : (f/d));
            }
            else if (a!=0 && b!=0 && c==0 && d==0) {
                return "1 " + ((-a/b)%1==0 ? ""+(int)(-a/b) : (-a/b)) + " " + ((e/b)%1==0 ? ""+(int)(e/b) : (e/b));
            }
        }
        return "s";
    }
}
