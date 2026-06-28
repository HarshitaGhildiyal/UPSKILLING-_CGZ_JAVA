

public class casting {
     public static void main(String[] args) {

        double decimalNumber = 15.89;
        int integerNumber = (int) decimalNumber;

        System.out.println("Double Value : " + decimalNumber);
        System.out.println("After Casting to int : " + integerNumber);

        int num = 25;
        double convertedDouble = (double) num;

        System.out.println("Integer Value : " + num);
        System.out.println("After Casting to double : " + convertedDouble);
    }
}
