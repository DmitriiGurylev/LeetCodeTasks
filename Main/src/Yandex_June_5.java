package src;

import java.util.Scanner;

public class Yandex_June_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String digits = scanner.nextLine();
        System.out.println(define(digits));
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

        if (appartment2floor <= floorsCount * (entrance2-1)){
            return -1 + " " + -1;
        }


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

        if (appartsPerFloor==0){
            return (appartment1<floorsCount ? 1 : 0) + " " + (floorsCount==1 ? 1 : (appartment2floor==2 ? appartment2floor: 0) );
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
