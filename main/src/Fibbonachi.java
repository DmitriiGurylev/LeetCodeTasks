package src;

public class Fibbonachi {

    public static int fibbIter(int val) {
        if (val<0) {
            return -1;
        }
        if (val==0) {
            return 0;
        }
        int first = 0;
        int second = 1;
        for (int i=1; i<val; i++) {
            int newVal = first + second;
            first = second;
            second = newVal;
        }
        return second;
    }

    public static int fibbRec(int val) {
        if (val < 0) {
            return -1;
        }
        return fibb(val, 0, 1);
    }

    public static int fibb(int val, int first, int second) {
        if (val == 0) {
            return first;
        } else if (val == 1) {
            return second;
        }
        return fibb(val-1, second, second+first);
    }
}
