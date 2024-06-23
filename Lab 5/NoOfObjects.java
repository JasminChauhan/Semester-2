public class NoOfObjects {
    static int count = 0;
    NoOfObjects(){
     count++;
    }
    public static void main(String[] args) {
        NoOfObjects n1 = new NoOfObjects();
        NoOfObjects n2 = new NoOfObjects();
        NoOfObjects n3 = new NoOfObjects();
        NoOfObjects n4 = new NoOfObjects();
        System.out.println("No of Objects Created = "+count);
    }
}
