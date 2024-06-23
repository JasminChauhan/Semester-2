import java.util.Scanner;
 class Max {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter number 1");
   int a = sc.nextInt();
   System.out.println("Enter number 2");
   int b = sc.nextInt();
   System.out.println("Enter number 3");
   int c = sc.nextInt();
   
   if(a>b) {
    if(b>c){
        System.out.println("Number "+a+" is maximum");
    }
    else {
        System.out.println("Number  "+c+" is maximum");
    }
   }
   else if(b>c) {
    
        System.out.println("Number  "+b+"is maximum");
    }
    
   else{
    System.out.println("Number "+c+" is maximum");
   
   }
 }
    
} 

