package src;

import java.util.Scanner;

public class Yandex_June_5 {
    public static void main(String[] args) {
        System.out.println(define("89 20 41 1 11") +". Числа: "+"89 20 41 1 11."+" Правильные ответы: 2 3");
        System.out.println(define("11 1 1 1 1") +". Числа: "+"11 1 1 1 1."+" Правильные ответы: 0 1");
        System.out.println(define("3 2 2 2 1") +". Числа: "+"3 2 2 2 1."+" Правильные ответы: -1 -1");
        System.out.println(define("5 20 2 1 1") +". Числа: "+"5 20 2 1 1."+" Правильные ответы: 1 0");
        System.out.println(define("11 2 4 1 2") +". Числа: "+"11 2 4 1 2."+" Правильные ответы: 0 2");
        System.out.println(define("1000 1 449 449 1") +". Числа: "+"1000 1 449 449 1."+" Правильные ответы: 1000 1");
        System.out.println(define("753 10 1000 1 1") +". Числа: "+"753 10 1000 1 1."+" Правильные ответы: 1 1");
        System.out.println(define("5 3 2 1 3") +". Числа: "+"5 3 2 1 3."+" Правильные ответы: -1 -1");
        System.out.println(define("41 10 41 1 10") +". Числа: "+"41 10 41 1 10."+" Правильные ответы: -1 -1");
        System.out.println(define("40 10 40 1 10") +". Числа: "+"40 10 40 1 10."+" Правильные ответы: 1 10");
        System.out.println(define("5 1000 5 1 2") +". Числа: "+"5 1000 5 1 2."+" Правильные ответы: 1 2");
        System.out.println(define("500 5 353 3 3") +". Числа: "+"500 5 353 3 3."+" Правильные ответы: 4 3");
        System.out.println(define("25 3 1 1 1") +". Числа: "+"25 3 1 1 1."+" Правильные ответы: 0 0");
        System.out.println(define("31 10 4 1 2") +". Числа: "+"31 10 4 1 2."+" Правильные ответы: 2 0");






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
        boolean singleDecision = true;

        for (int i = 0; i < Math.max(appartment1, appartment2); i++) {

            tr =   ((float) appartment2 / (i + 1)) % 1 == 0 ? appartment2 / (i + 1) : appartment2 / (i + 1) + 1;


            if ((entrance2 - 1) * floorsCount + appartment2floor == tr) {

                if (
                        (entrance2 - 1) * floorsCount + appartment2floor ==
                                (((float) appartment2 / (i + 2)) % 1 == 0 ?
                                        appartment2 / (i + 2) :
                                        appartment2 / (i + 2) + 1)){
                    singleDecision = false;
                }
                appartsPerFloor = i + 1;
                break;
            }
        }

        if (appartment2 <= floorsCount * (entrance2-1) || appartment2 < (entrance2-1)*floorsCount+appartment2floor){
            return -1 + " " + -1;
        }

        int from = (((float)appartment2/(appartment2floor+(entrance2-1)*floorsCount)%1==0) ?
                appartment2/(appartment2floor+(entrance2-1)*floorsCount) :
                appartment2/(appartment2floor+(entrance2-1)*floorsCount) +1) * ((appartment2floor+(entrance2-1)*floorsCount)-1);
        int to = (((float)appartment2/(appartment2floor+(entrance2-1)*floorsCount))%1==0 ?
                appartment2/(appartment2floor+(entrance2-1)*floorsCount) :
                appartment2/(appartment2floor+(entrance2-1)*floorsCount) +1) * (appartment2floor+(entrance2-1)*floorsCount);
        if (from < appartment2 && appartment2 <= to) {
        } else {
            return -1 + " " + -1;
        }

        if (appartment1==appartment2){
            return entrance2 + " " + appartment2floor;
        }

        if ( !singleDecision){

            String first;
            if (appartment2floor==1 && entrance2==1){
                if (floorsCount==1) {
                    return "0 1";
                }
                else if (floorsCount>1 && appartment1>appartment2) {
                    return (appartment1<=floorsCount) ? "1 0" : "0 0";
                }
            }

            if ((appartment2floor==1 && entrance2==1 && appartment1 < appartment2 || appartment1 <= floorsCount)){
                first = "1";
            }
            else if (appartment2floor==1 && entrance2==1 && appartment1 > appartment2){
                first = "0";
            }
            else{
                int i=0;
                while(true){
                    i++;
                    if (appartment1 <= i*floorsCount*appartsPerFloor){
                        int j=0;
                        while(true){
                            j++;
                            if (appartment1 <= j*floorsCount*(appartsPerFloor+1)){
                                first = (i == j) ?
                                        ""+(i) :
                                        "0";
                                break;
                            }
                        }
                        break;
                    }
                }
            }

            String second;
            if (floorsCount==1 || (appartment1<appartment2 && appartment2floor==1)){
                second = "1";
                return first + " " + second;
            }

            int i=0;
            while(true){
                i++;
                if (appartment1 <= i*floorsCount*appartsPerFloor){
                    second = (appartment1 <= i*floorsCount*(appartsPerFloor+1)) ?
                            ""+(i-1) :
                            "0";
                    break;
                }
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
