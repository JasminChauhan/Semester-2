import java.util.Scanner;
public class SumByScanner {
    public static void main(String[] args) {
        System.out.println("Enter Number 1: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter Number 2: ");
        int  b = sc.nextInt();
        int c = a + b;
        System.out.println("The Sum Of Two Numbers= "+c);    
    }
}
