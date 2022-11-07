package src;

import java.util.Scanner;

public class Yandex_Cup_2022_2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int homeWorks = Integer.parseInt(console.nextLine());

        for (long i=0; i<homeWorks; i++) {
            String[] valuesStr = console.nextLine().split(" ");
            long exercises = Long.parseLong(valuesStr[0]);
            long divider = Long.parseLong(valuesStr[1]);
            long counter = 0;

            if (divider==1) {
                System.out.println(exercises);
                return;
            }

            for (long j=1; j<=exercises; j++) {
                if (String.valueOf(j).chars().anyMatch(c -> Integer.parseInt(String.valueOf(c))<divider)) {
                    continue;
                }
                if (j %divider !=0) {
                    continue;
                }

                long rightSolution =  j/divider;

                StringBuilder sb = new StringBuilder("0");
                String str = String.valueOf(j);
                for (int z=0; z < str.length(); z++) {
                    int val = Integer.parseInt(str.substring(z, z + 1));
                    if (val < divider) {
                        break;
                    }
                    sb.append(val/divider);
                }
                System.out.println(j);
                if (Long.parseLong(sb.toString()) == rightSolution) {
                    counter++;
                    System.out.println("---------------------------------------------------------");
                }
            }
            System.out.println(counter);
        }
    }
}
