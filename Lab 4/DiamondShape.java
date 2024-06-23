import java.util.Scanner;
public class DiamondShape {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a Number for Diamond Shape: ");
     int a = sc.nextInt();
     for(int i =0;i<a;i++){
           for(int j=0;j<i;j++) {
            System.out.print("*");
           }
           System.out.println("");
     }
     for(int i =a;i>=0;i--) {
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
     }
    }
}
