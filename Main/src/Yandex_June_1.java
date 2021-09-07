package src;

import java.util.*;

public class Yandex_June_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        String mode = scanner.nextLine();
        System.out.println(tempFinal(temp, mode));
    }

    public static int tempFinal(String temp, String mode) {
        String[] modesAvailable = new String[]{"freeze", "heat", "auto", "fan"};
        int tempNow = Integer.parseInt(temp.split(" ")[0]);
        int tempInHour = Integer.parseInt(temp.split(" ")[1]);
        try {
            if (
                    !(modesAvailable[0].equals(mode) ||
                    modesAvailable[1].equals(mode) ||
                    modesAvailable[2].equals(mode) ||
                    modesAvailable[3].equals(mode)) ||
                    (tempNow < -50) ||
                    (tempInHour < -50) ||
                    (tempNow > 50) ||
                    (tempInHour > 50)) throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (mode.equals("freeze")){return Math.min(tempNow, tempInHour);}
        else if (mode.equals("heat")){return Math.max(tempNow, tempInHour);}
        else if (mode.equals("auto")){return tempInHour;}
        else return tempNow;
    }
}