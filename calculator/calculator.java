
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        
         System.out.println("enter the operation you want do");
        char operator=sc.next().charAt(0);
        double result;
        switch(operator){
        case '+':
            result=num1+num2;
            break;
        
        case '-':
        result=num1-num2;
        break;
        
        case '*':
        result=num1*num2;
        break;

        case '/':
        if(num2!=0){
            result=num1/num2;
        }
        else{
            System.out.println("invalid");
        }
        break;
        default:
        System.out.println("Inavlid Operator");
    }
    sc.close();
}
}
