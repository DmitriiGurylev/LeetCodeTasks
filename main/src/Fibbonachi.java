package src;

public class Fibbonachi {

    public static void main(String[] args) {
        System.out.println(fibbIter(-1));
        System.out.println(fibbIter(0));
        System.out.println(fibbIter(1));
        System.out.println(fibbIter(2));
        System.out.println(fibbIter(4));
        System.out.println(fibbIter(8));
        System.out.println(fibbIter(16));
        System.out.println(fibbIter(32));
        System.out.println(fibbIter(64));

        System.out.println(fibbRec(-1));
        System.out.println(fibbRec(0));
        System.out.println(fibbRec(1));
        System.out.println(fibbRec(2));
        System.out.println(fibbRec(4));
        System.out.println(fibbRec(8));
        System.out.println(fibbRec(16));
        System.out.println(fibbRec(32));
        System.out.println(fibbRec(64));
    }

    private static int fibbIter(int val) {
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

    private static int fibbRec(int val) {
        if (val < 0) {
            return -1;
        }
       return fibb(val, 0, 1);
    }

    private static int fibb(int val, int first, int second) {
        if (val == 0) {
            return first;
        } else if (val == 1) {
            return second;
        }
        return fibb(val-1, second, second+first);
    }

}
