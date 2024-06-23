import java.util.*;
public class ArrayAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a[] = new float[4];
        
        for(int i=0;i<4;i++)  {
            System.out.println("Enter a value of array: ");
            a[i]=sc.nextFloat();
        }
         float avg = (a[0]+ a[1]+a[2]+a[3])/4;
         System.out.println("Average of array is"+ avg);
        
    }
}