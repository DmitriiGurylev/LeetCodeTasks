package src;

public class PolynomialEvaluationAlgorithm {
    public static void main(String[] args) {
        int[] nomials = {1,5,2,4,8};
        int x = 10;
        System.out.println(evaluate(nomials,x));
        System.out.println(showAsString(nomials));
    }

    public static String showAsString(int[] nomials) {
        StringBuilder strBuild = new StringBuilder();
        for (int i = nomials.length-1; i>=0; i--) {

            if (i == nomials.length-1) {
                strBuild.append("x*").append(nomials[i]);
            } else {
                strBuild = new StringBuilder("x*(" + nomials[i] + "+" + strBuild + ")");
            }
        }
        return strBuild.toString();
    }

    public static int evaluate(int[] nomials, int x) {
        int finalValue = 0;
        for (int i = nomials.length-1; i>=0; i--) {

            if (i == nomials.length-1) {
                finalValue = x * nomials[i];
            } else {
                finalValue = x * (finalValue + nomials[i]);
            }
        }
        return finalValue;
    }

}
