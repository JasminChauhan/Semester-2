import java.util.Scanner;

public class Palindromestr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int s = 0;
        int e = a.length() - 1;
        int x = 0;
        while (s <= e) {
            if (a.charAt(s) != a.charAt(e)) {
                x = 1;
                break;
            }
            s++;
            e--;

        }
        if (x == 1) {
            System.out.println("Not Palindrome");
        } else {
            System.out.println("Palindrome");
        }
    }
}
