import java.util.Scanner;
class Bank {
    int accountNo;
     String username;
     String email;
     String accountType;
     float accountBalance;
     public void getAccDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account no:");
        accountNo = sc.nextInt();
        System.out.println("Enter Username:");
         username = sc.next();
        System.out.println("Enter Email:");
        email = sc.next();
        System.out.println("Enter Account Type:");
         accountType = sc.next();
        System.out.println("Enter Account Balance:");
         accountBalance = sc.nextFloat();
    }
       public void display() {
        System.out.println("Account no:"+accountNo);
        System.out.println("Username:" +username);
        System.out.println("Email:" +email);
        System.out.println("Account Type:" +accountType);
        System.out.println("Account Balance:" +accountBalance);
    }
}

public class BankAcc {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.getAccDetails();
        b1.display();
    }
}
