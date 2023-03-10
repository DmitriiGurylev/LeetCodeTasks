package src;

import java.util.Scanner;

public class Yandex_June_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String digits = scanner.nextLine();
        System.out.println(deskSquare(digits));
    }

    public static String deskSquare(String str){
        String[] splits = str.split(" ");
        int a1 = Integer.parseInt(splits[0]);
        int b1 = Integer.parseInt(splits[1]);
        int a2 = Integer.parseInt(splits[2]);
        int b2 = Integer.parseInt(splits[3]);

        int minOfMaxSide;
        int anotherMax;
        int anotherMin;

        int max1 = Math.max(a1,b1);
        int max2 = Math.max(a2,b2);
        int maxSide = Math.max( max1, max2);
        if (max1>max2){
            minOfMaxSide = Math.min(a1,b1);
            anotherMax = max2;
            anotherMin = Math.min(a2,b2);
        }
        else if (max1<max2){
            minOfMaxSide = Math.min(a2,b2);
            anotherMax = max1;
            anotherMin = Math.min(a1,b1);
        }
        else{
            minOfMaxSide = Math.max( Math.min(a1,b1), Math.min(a2,b2));
            anotherMax = max1;
            anotherMin = Math.min( Math.min(a1,b1), Math.min(a2,b2));
        }
        int result1 = maxSide * (minOfMaxSide+anotherMin);
        int result2 = maxSide * (minOfMaxSide+anotherMax);
        int result3 = Math.max(minOfMaxSide,anotherMax) * (maxSide+anotherMin);
        int result4 = Math.max(minOfMaxSide,anotherMin) * (maxSide+anotherMax);

        if (result1 <= result2  && result1 <= result3 && result1 <= result4)
            return maxSide + " " + (minOfMaxSide+anotherMin);
        else if (result2 <= result1 && result2 <= result3 && result2 <= result4)
            return maxSide + " " + (minOfMaxSide+anotherMax);
        else if (result3 <= result1 && result3 <= result2 && result3 <= result4)
            return Math.max(minOfMaxSide,anotherMax) + " " + (maxSide+anotherMin);
        else
            return Math.max(minOfMaxSide,anotherMin) + " " + (maxSide+anotherMax);
    }
}
