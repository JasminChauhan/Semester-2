import java.util.Scanner;
class Circle {  
     void display(float rad){
        float r =rad;
       double area = Math.PI * r * r;
        System.out.println("the area of Circle = "+area);
     }
}
public class CircleArea{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        Circle c1 = new Circle();
        float rad = sc.nextInt();
        c1.display(rad);
    }
}