class Triangle {
    double a, b, c;
    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double findArea() {
        c = a * b / 2;
        return c;
    }
}

public class Page164_1 {
    public static void main(String[]args) {
        Triangle t = new Triangle(10.0, 5.0);
        System.out.println(t.findArea());
    }
}
