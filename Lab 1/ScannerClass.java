import java.util.Scanner;
public class ScannerClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Number you entered is: "+a);
    }
}