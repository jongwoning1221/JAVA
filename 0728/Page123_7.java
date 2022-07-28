import java.util.Scanner;

public class Page123_7 {
    public static void main(String[]args) {
        String c = input("철수");
        String y = input("영희");
        whoWin(c, y);
    }

    public static  String input(String a) {
        String b;
        Scanner s = new Scanner(System.in);
        System.out.print(a +" : ");
        b = s.next();

        return b;
    }

    public static void whoWin(String c, String y) {
        if(c.equals("s") && y.equals("s") || c.equals("r") && y.equals("r") || c.equals("p") && y.equals("p")) {
            System.out.println("무승부");
        } else if (c.equals("s") && y.equals("p") || c.equals("r") && y.equals("s") || c.equals("p") && y.equals("r")) {
            System.out.println("철수, 승!");       
        } else {
            System.out.println("영희, 승!");
        }
    }
}