import java.util.Scanner;

public class constvowel {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String: ");
    String s = sc.next();
    int c = 0;
    int v = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
        v++;
      else if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
          || s.charAt(i) == 'U')
        v++;
      else {
        c++;
      }
    }
    System.out.println("Number of Vowels in  a String : " + v);
    System.out.println("Number of Consonants in a String : " + c);

  }
}
