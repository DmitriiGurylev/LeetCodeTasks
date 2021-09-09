package src;

import java.util.Scanner;

public class Yandex_June_5 {
    public static void main(String[] args) {
        System.out.println(define("89 20 41 1 11")); // 2 3
        System.out.println(define("11 1 1 1 1")); // 0 1
        System.out.println(define("3 2 2 2 1")); // -1 -1
        System.out.println(define("5 20 2 1 1")); // 1 0
        System.out.println(define("11 2 4 1 2")); // 0 2
        System.out.println(define("1000 1 449 449 1")); // 1000 1
        System.out.println(define("753 10 1000 1 1")); // 1 1
        System.out.println(define("5 3 2 1 3")); // -1 -1
        System.out.println(define("41 10 41 1 10")); // -1 -1
        System.out.println(define("40 10 40 1 10")); //





//        Scanner scanner = new Scanner(System.in);
//        String digits = scanner.nextLine();
//        System.out.println(define(digits));
    }

    public static String define(String str) {
        String[] splits = str.split(" ");
        int appartment1 = Integer.parseInt(splits[0]);
        int floorsCount = Integer.parseInt(splits[1]);
        int appartment2 = Integer.parseInt(splits[2]);
        int entrance2 = Integer.parseInt(splits[3]);
        int appartment2floor = Integer.parseInt(splits[4]);

        int appartment1floor = 0;
        int entrance1 = 0;
        int appartsPerFloor = 0;
        int tr;




        for (int i = 0; i < Math.max(appartment1, appartment2); i++) {

            tr =   ((float) appartment2 / (i + 1)) % 1 == 0 ? appartment2 / (i + 1) : appartment2 / (i + 1) + 1;


            if ((entrance2 - 1) * floorsCount + appartment2floor == tr) {

                if ((entrance2 - 1) * floorsCount + appartment2floor == (((float) appartment2 / (i + 2)) % 1 == 0 ? appartment2 / (i + 2) : appartment2 / (i + 2) + 1)){
                }
                else {
                    appartsPerFloor = i + 1;
                }
                break;
            }
        }

        if (appartment2 <= floorsCount * (entrance2-1) ||
                appartment2 < (entrance2-1)*floorsCount+appartment2floor ||
                (appartment1==appartment2 && appartsPerFloor==0)){
            return -1 + " " + -1;
        }
        if (appartment1==appartment2){
            return entrance2 + " " + appartment2floor;
        }

        if (appartsPerFloor==0){

            String first;
            if (appartment1<floorsCount || (appartment1<appartment2 && appartment2floor==1)){
                first = "1";
            }
            else{
                first = "0";
            }

            String second;
            if (floorsCount==1 || (appartment1<appartment2 && appartment2floor==1)){
                second = "1";
            }
            else if (appartment2floor==2) {
                second = ""+appartment2floor;
            }
            else{
                second = "0";
            }

            return first + " " + second;
        }



        int i=0;
        while(true) {
            if ((i + 1) * appartsPerFloor * floorsCount >= appartment1) {
                entrance1 = i + 1;
                break;
            }
            i++;
        }
        int floorNeed = (appartment1 - ((entrance1 - 1) * floorsCount * appartsPerFloor)) / appartsPerFloor;
        appartment1floor =
                (float) (appartment1 - ((entrance1 - 1) * floorsCount * appartsPerFloor)) / appartsPerFloor % 1 == 0 ?
                        floorNeed :
                        floorNeed + 1;
        if (appartment1floor>floorsCount){
            appartment1floor=floorsCount;
        }

        return  entrance1 + " " + appartment1floor;
    }
}
