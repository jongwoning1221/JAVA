import java.util.Scanner;

public class Page81_7 {
    public static void main(String[]args) {
        int a;
        boolean b, c, d;

        try (Scanner s = new Scanner(System.in)) {
            System.out.print("정수를 입력하세요 : ");
            a = s.nextInt();
        }
        b = (a % 4 == 0) && (a % 5 == 0) ? true : false;
        c = (a % 4 == 0) || (a % 5 == 0) ? true : false;
        d = (a % 4 != 0) && (a % 5 != 0) ? false : true;

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
