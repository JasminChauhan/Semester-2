import java.util.Scanner;
public class Palindrome {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = sc.nextInt();
        int b;
        int c=0;
        int m = a;
        
        while(a!=0) {
              b = a%10;
              c = (c*10)+b;
              a = a/10; 
        }
        if(c==m){
            System.out.println("Entered Number is Palindrome");
             }
        else {
                 System.out.println("Entered Number is not Palindrome");
             }
        
    }
}    