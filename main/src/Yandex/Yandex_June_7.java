package src;

import java.util.Scanner;

public class Yandex_June_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String digits = scanner.nextLine();
        System.out.println(items(digits));
    }

    public static int items(String str) {
        String[] splits = str.split(" ");
        int n = Integer.parseInt(splits[0]);
        int k = Integer.parseInt(splits[1]);
        int m = Integer.parseInt(splits[2]);
        if (k>n || m>k) { return 0; }
        int count=0;
        while (n >= k) {
            count += k/m;
            n += -k + k%m ;
        }
        return count;
    }
}