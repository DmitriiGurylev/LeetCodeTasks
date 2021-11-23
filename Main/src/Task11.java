package src;

public class Task11 {

    public static void main (String[] args){

    }


    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;

        while (i<j) {
            char transientChar = s[i];
            s[i] = s[j];
            s[j] = transientChar;
            i++;
            j--;
        }
    }

}
