package src;//package src;

import java.math.BigInteger;
import java.util.*;

public class Task10 {

    public static void main (String[] args){
        int[][] mat1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(findDiagonalOrder(mat1)));
        System.out.println(spiralOrder(mat1));
    }

    public static int[] findDiagonalOrder(int[][] mat) {
        int[] arrNew = new int[mat.length * mat[0].length];
        int row=0, column=0;
        int i=0;

        while (true){
            while(column<mat[0].length && row>=0){
                arrNew[i] = mat[row][column];
                if (row==mat.length-1 && column==mat[0].length-1){
                    return arrNew;
                }
                row--;
                column++;
                i++;
            }
            if (row==-1 && column==mat[0].length){
                row++;
                row++;
                column--;
            }
            else if (row==-1){
                row++;
            }
            else if (column==mat[0].length){
                column--;
                row++;
                row++;
            }
            while (column>=0 && row<mat.length){
                arrNew[i] = mat[row][column];
                if (row==mat.length-1 && column==mat[0].length-1){
                    return arrNew;
                }
                row++;
                column--;
                i++;
            }
            if (row==mat.length && column==-1){
                row--;
                column++;
                column++;
            }
            else if (column==-1){
                column++;
            }
            else if (row==mat.length){
                column++;
                column++;
                row--;
            }
        }
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> list = new ArrayList<>();
        int matrixSize = matrix.length * matrix[0].length;
        int row=0, column=0, rowUp=0, rowDown=0, columnLeft=0, columnRight=0;

        while (true){

            while(column<matrix[0].length - columnRight){
                list.add(matrix[row][column]);
                if (list.size() == matrixSize){
                    return list;
                }
                column++;
            }
            rowUp++;
            if (column==matrix[0].length - columnRight){
                row++;
                column--;
            }

            while(row<matrix.length - rowDown){
                list.add(matrix[row][column]);
                if (list.size() == matrixSize){
                    return list;
                }
                row++;
            }
            columnRight++;
            if (row==matrix.length - rowDown){
                row--;
                column--;
            }

            while(column>= columnLeft){
                list.add(matrix[row][column]);
                if (list.size() == matrixSize){
                    return list;
                }
                column--;
            }
            rowDown++;
            if (column<columnLeft){
                row--;
                column++;
            }

            while(row>= rowUp){
                list.add(matrix[row][column]);
                if (list.size() == matrixSize){
                    return list;
                }
                row--;
            }
            columnLeft++;
            if (row<rowUp){
                row++;
                column++;
            }
        }
    }
}
