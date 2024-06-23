import java.util.*;

public class DivisionByMarks {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first subject marks: ");
    int a = sc.nextInt();
    System.out.println("Enter second subject marks: ");
    int b = sc.nextInt();
    System.out.println("Enter third subject marks: ");
    int c = sc.nextInt();
    System.out.println("Enter fourth subject marks: ");
    int d = sc.nextInt();
    System.out.println("Enter fifth subject marks: ");
    int e = sc.nextInt();
    int f = (a + b + c + d + e) / 5;
    System.out.println("Percentage = " + f + "%");
    if (f >= 60) {
      System.out.println("First Division");
    } else if (f >= 50 && f <= 59) {
      System.out.println("Second Division");
    } else if (f >= 40 && f <= 49) {
      System.out.println("Third Division");
    } else {
      System.out.println("Fail");
    }
  }
}
