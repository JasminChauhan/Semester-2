import java.util.Scanner;
public class PyramidForm  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to convert in pyramid form: ");
        String a = sc.nextLine();
        for(int i=0;i<=a.length();i++) {
            System.out.println(a.substring(0,i));
        }
    }
}
