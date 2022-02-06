package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task20 {
    public static void main(String[] args) {
        System.out.println(new Task20().getRow(3));
    }

    public List<Integer> getRow(int rowIndex) {
        rowIndex++;
        Integer[][] externalArray = new Integer[rowIndex][];

        for (int i=0; i<rowIndex; i++){
            Integer[] innerArray = new Integer[i+1];
            externalArray[i] = innerArray;

            innerArray[0]=1;
            innerArray[innerArray.length-1]=1;

            for (int j=1; j< innerArray.length-1; j++){
                innerArray[j] = externalArray[i-1][j-1] + externalArray[i-1][j];
            }
            if (i == rowIndex-1) {
                return List.of(innerArray);
            }
        }
        return null;
    }
}

