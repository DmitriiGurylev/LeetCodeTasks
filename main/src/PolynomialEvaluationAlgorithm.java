package src;

import java.util.Arrays;

public class PolynomialEvaluationAlgorithm {
    public static void main(String[] args) {
        int[] nomials = {1,5,2,4,8};
        int x = 10;
        System.out.println(showAsString(nomials));
        System.out.println(Arrays.toString(evaluate(nomials, x)));
    }

    public static String showAsString(int[] nomials) {

        StringBuilder strBuild1 = new StringBuilder();
        for (int i = nomials.length-1; i>=0; i--) {
            if (i == nomials.length-1) {
                strBuild1.append("x*").append(nomials[i]);
            } else if (i == nomials.length-2) {
                strBuild1 = new StringBuilder(nomials[i] + "+" + strBuild1);
            } else {
                strBuild1 = new StringBuilder(nomials[i] + "+" + "x*(" + strBuild1 + ")");
            }
        }

        StringBuilder strBuild2 = new StringBuilder();
        for (int i = 0; i< nomials.length; i++) {
            if (i == 0) {
                strBuild2.append(nomials[i]);
            } else if (i == 1){
                strBuild2.append(" + ").append(nomials[i]).append("*x");
            } else {
                strBuild2.append(" + ").append(nomials[i]).append("*x^").append(i);
            }
        }

        return strBuild1 + " or " + strBuild2;
    }

    public static int[] evaluate(int[] nomials, int x) {
        int[] finalValues1 = new int[nomials.length];
        for (int i = nomials.length-1; i>=0; i--) {
            if (i == nomials.length-1) {
                finalValues1[i] = nomials[i];
            } else {
                finalValues1[i] = finalValues1[i+1]*x + nomials[i];
            }
        }
        // 1+x*(5+x*(2+x*(4+x*8))) or 1 + 5*x + 2*x^2 + 4*x^3 + 8*x^4

        int[] finalValues2 = new int[nomials.length];
        for  (int i = 0; i< nomials.length; i++) {
            if (i == 0) {
                finalValues2[i] = nomials[i];
            } else {
                finalValues2[i] = (int) (nomials[i] * Math.pow(x,i));
            }
        }

        int vvvvv1 = finalValues1[0];
        int vvvvv2 = Arrays.stream(finalValues2).sum();
        return finalValues2;
    }

}
