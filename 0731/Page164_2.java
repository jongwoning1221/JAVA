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

    public String isSameArea(Triangle u) {
        if(u.findArea() == findArea()) {
            return ("넓이가 같음.");
        } else {
            return ("넓이가 다름.");
        }
    }
}

public class Page164_2 {
    public static void main(String[]args) {
        Triangle t1 = new Triangle(10.0, 5.0);
        Triangle t2 = new Triangle(5.0, 10.0);
        Triangle t3 = new Triangle(8.0, 8.0);
        
        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));
    }
}