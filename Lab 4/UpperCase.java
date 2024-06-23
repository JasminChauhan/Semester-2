
public class UpperCase {
    public static void main(String[] args) {
   
       for(int i =0;i<args.length;i++) {
        char a = args[i].charAt(0);
        int b = (int)a;
        if(b>=65 && b<=91)  {
          System.out.println("String is Uppercase");
         }
         else {
          System.out.println("Not Valid");
          return;
         }
       }
       
               
       
        
     }
      
}
