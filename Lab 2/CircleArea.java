import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in); 
       System.out.println("Enter Radius");
       float r = sc.nextFloat();
       float pie = 3.14f;
       System.out.println("The Area Of Circle is = "+(pie*r*r));
   }
}
