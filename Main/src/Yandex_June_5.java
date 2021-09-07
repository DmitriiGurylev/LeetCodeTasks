package src;

import java.util.Scanner;

public class Yandex_June_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String digits = scanner.nextLine();
        System.out.println(define(digits));
    }


    public static String define(String str){
        String[] splits = str.split(" ");
        int appartment1 = Integer.parseInt(splits[0]);
        int floorsCount = Integer.parseInt(splits[1]);
        int appartment2 = Integer.parseInt(splits[2]);
        int entrance = Integer.parseInt(splits[3]);
        int appartment2floor = Integer.parseInt(splits[4]);

        int appartsPerFloor = appartment2 / appartment2floor + 1;
        int appartsPerEntrance = appartsPerFloor * floorsCount;
        int neededEntrance = appartment1 / appartsPerEntrance + 1;



    }
}
