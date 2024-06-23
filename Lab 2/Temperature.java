import java.util.Scanner;
public class Temperature {
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter temperature in fahrenhit: ");
     float f = sc.nextFloat();
     float c = f-32*5/9;
     System.out.println("Temperature in celcius = "+c);
   }  
}
