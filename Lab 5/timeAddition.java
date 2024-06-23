class Time{
   int hour;
   int minute;
    Time(int hour,int minute){
        this.hour = hour;
        this.minute = minute;
    }
    void addition(Time t2){
    //  int a = this.hour + t2.hour;
    //  int b = this.minute + t2.minute; 
        this.hour += t2.hour;
        this.minute += t2.minute;
    }

}
public class timeAddition {
    public static void main(String[] args){
       Time t1 = new Time(1,3);
       Time t2 = new Time(3,5);
       t1.addition(t2);
       System.out.println(t1.hour +":"+t1.minute);
    } 
}
