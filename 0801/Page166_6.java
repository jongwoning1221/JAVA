class Complex {
    double a, b;
    public Complex(double a) {
        this.a = a;
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void print() {
        System.out.println(a + " + " + b + "i");
    }
}

public class Page166_6 {
    public static void main(String[]args) {
        Complex c1 = new Complex(2.0);
        c1.print();
        Complex c2 = new Complex(1.5, 2.5);
        c2.print();
    }
}