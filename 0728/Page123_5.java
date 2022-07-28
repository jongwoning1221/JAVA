public class Page123_5 {
    public static void main(String[]args) {
        int a, b, c;

        for(a = 1; a < 20; a++) {
            for(b = 1; b < 20; b++) {
                for(c = 1; c < 20; c++) {
                    if(a*a + b*b == c*c) {
                        System.out.print(a + " " + b + " " + c);
                        System.out.println();
                    }
                }
            }
        }
    }
}
