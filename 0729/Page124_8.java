public class Page124_8 {
    public static void main(String[]args) {
        System.out.println(factorial(5));
    }

    static int factorial(int a) {
        int b = switch (a) {
            case 0, 1 -> 1;
        
            default -> {int c = 1; int d = a;
            while (d > 0) {
                c = c*d;
                d--;
            } yield c; }
        };
        return b;
    };
}
