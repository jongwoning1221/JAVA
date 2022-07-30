class Triangle {
    private double a, b;
    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double findArea() {
        return a * b / 2;
    }
}

public class Page164_1 {
    public static void main(String[]args) {
        Triangle t = new Triangle(10.0, 5.0);
        System.out.println(t.findArea());
    }
}