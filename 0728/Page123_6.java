import java.util.Scanner;

public class Page123_6 {
    public static void main(String[]args) {
        String a, b = "";

        try (Scanner s = new Scanner(System.in)) {
            System.out.print("철수 : ");
            a = s.next();

            System.out.print("영희 : ");
            b = s.next();
        }
        if(a.equals("s") && b.equals("s") || a.equals("r") && b.equals("r") || a.equals("p") && b.equals("p")) {
            System.out.println("무승부");
        } else if (a.equals("s") && b.equals("p") || a.equals("r") && b.equals("s") || a.equals("p") && b.equals("r")) {
            System.out.println("철수, 승!");       
        } else {
            System.out.println("영희, 승!");
        }
    }
}
