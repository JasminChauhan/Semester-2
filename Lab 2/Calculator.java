import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        float a = sc.nextFloat();
        System.out.println("Enter second number: ");
        float b = sc.nextFloat();
        System.out.println("Enter operation from +,-,*,/,%: ");
        String c = sc.next();
        switch(c){
            case "+": System.out.println("Sum of two numbers is= "+(a+b));
                      break;
            case "-": System.out.println("Subtraction of two numbers is= "+(a-b));
                      break;
            case "*": System.out.println("Multiplication of two numbers is= "+(a*b));
                      break;
            case "/": System.out.println("Division of two numbers is= "+(a/b));
                      break;
            case "%": System.out.println("Modulus of two numbers is= "+(a%b));
                      break;
        }
    }
}
