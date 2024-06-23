import java.util.*;
public class LenOfStr {
    public static void main(String[] args) {
       System.out.println("Enter a string: ");
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       int len = s.length();
       System.out.println("String length is "+len+"");
       System.out.println("Half Of the String is "+s.substring(len/2));

    }
}
