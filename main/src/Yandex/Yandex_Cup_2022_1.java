package src;

import java.util.Scanner;

public class Yandex_Cup_2022_1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] valuesStr = console.nextLine().split(" ");
        int side = Integer.parseInt(valuesStr[0]);
        int colors = Integer.parseInt(valuesStr[1]);

        if (side*side % colors != 0) {
            System.out.println("No");
            return;
        }
        if (side>1 && colors==1) {
            System.out.println("No");
            return;
        }

        int counter = 1;

        System.out.println("Yes");
        for (int i=0; i<side; i++) {
            if (i >= colors) {
                if ((i + 1) % colors == 0) {
                    counter = colors;
                } else {
                    counter = (i + 1) % colors;
                }
            }
            else {
                counter = i + 1;
            }
            for (int j=0; j<side; j++) {
                System.out.print(counter+" ");
                counter++;
                if (counter > colors) {
                    counter = 1;
                }
            }
            System.out.println();
        }
    }
}
