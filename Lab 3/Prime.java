import java.util.Scanner;
public class Prime {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number: ");
    int a = sc.nextInt();
    int fact=0;
      for(int i = 2; i<=a/2;i++) {
        if(a%i==0) {
            fact++;
        }
        
      }
      if(fact==0) {
        System.out.println("NUmber is prime");
      }
      else {
        System.out.println("Number is not prime");
      }
    
 }   
}
