class Complex{
    int real;
    int imaginary;
    Complex(int real){
        this.real = 20;
        this.imaginary = 20;
    }
    Complex(int real,int imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }
    Complex add(Complex a){
        a.real += this.real;
        a.imaginary += this.imaginary;
        return a;
    }
}   

public class ComplexNumber {
    public static void main(String[] args){
        Complex c1 = new Complex(5);
        Complex c2 = new Complex(5,5);
        Complex c = c1.add(c2);
        System.out.println("Real Number = "+c.real);
        System.out.println("Complex Number = "+c.real+"i");
    }
}