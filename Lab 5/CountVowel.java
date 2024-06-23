import java.util.Scanner;
class GetData{
        int count_A;
        int count_E;
        int count_I;
        int count_O;
        int count_U;
    public GetData(){
         count_A = 0;
         count_E = 0;
         count_I = 0;
         count_O = 0;
         count_U = 0;
    }
    void VowelCount(){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine();
        while(!s.equals("quit")){
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i) == 'a' || s.charAt(i) == 'A'){
                    count_A++;
                }
                else if(s.charAt(i) == 'e' || s.charAt(i) == 'E'){
                    count_E++;
                }
                else if(s.charAt(i) == 'i' || s.charAt(i) == 'I'){
                     count_I++;
                }
                else if(s.charAt(i) == 'o' || s.charAt(i) == 'O'){
                     count_O++;
                }
                else if(s.charAt(i) == 'u' || s.charAt(i) == 'U'){
                    count_U++;
                }  

                    
            }    
            System.out.println("Enter a sentence:");
                s = sc.nextLine();      
    }
    System.out.println("Count of A is = "+count_A);
    System.out.println("Count of E is = "+count_E);
    System.out.println("Count of I is = "+count_I);
    System.out.println("Count of O is = "+count_O);
    System.out.println("Count of U is = "+count_U);  
}
}
public class CountVowel {
    public static void main(String[] args){
        GetData d = new GetData();
        d.VowelCount();
}
}
