package src;

import java.util.Arrays;
import java.util.Scanner;

public class Yandex_June_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNeeded = scanner.nextLine();
        String phone1 = scanner.nextLine();
        String phone2 = scanner.nextLine();
        String phone3 = scanner.nextLine();
        System.out.println(alreadyExist(phoneNeeded,phone1,phone2,phone3));
    }

    public static String alreadyExist(String numberNew, String number1, String number2, String number3){
        String resultStr1 = rebuild(numberNew).equals(rebuild(number1)) ? "YES" : "NO";
        String resultStr2 = rebuild(numberNew).equals(rebuild(number2)) ? "YES" : "NO";
        String resultStr3 = rebuild(numberNew).equals(rebuild(number3)) ? "YES" : "NO";
        return resultStr1 + "\n"+
                resultStr2 + "\n"+
                resultStr3;
    }
    public static String rebuild (String phoneNumber){
        String[] t = phoneNumber.split("[- | ( | )]");
        StringBuilder numberNewRebuild = new StringBuilder();
        for (String str : t){
            numberNewRebuild.append(str);
        }

        if (numberNewRebuild.charAt(0) == '8' && numberNewRebuild.length()==11){
            numberNewRebuild.delete(0,1);
        }
        else if (numberNewRebuild.substring(0,2).equals("+7")){
            numberNewRebuild.delete(0,2);
        }

        if (numberNewRebuild.length()==7){
            numberNewRebuild.insert(0,"495");
        }
        return numberNewRebuild.toString();
    }
}