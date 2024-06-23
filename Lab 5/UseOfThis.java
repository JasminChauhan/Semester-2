class DemoThis{
    int no;
    DemoThis(){
        this.no = 10;
    }
    int add(DemoThis a){
        this.no += a.no;
        return this.no;
    }
}
public class UseOfThis {
    static int a = 10;
    int n;
    UseOfThis(){
        this.n = a;
    }
        public static void main(String[] args){
            DemoThis d = new DemoThis();
            DemoThis d1 = new DemoThis();
            d.add(d1);
            UseOfThis t = new UseOfThis();
           System.out.println(t.n);
            
            
            
        }   
    }