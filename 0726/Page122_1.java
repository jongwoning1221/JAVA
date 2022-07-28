import java.util.Scanner;

public class Page122_1 {
    public static void main(String[]args) {
        int a;

        try (Scanner s = new Scanner(System.in)) {
            System.out.print("나이를 입력하세요. : ");
            a = s.nextInt();
        }
        if(a >= 19) {
            System.out.println("성년");
        } else {
            System.out.println("미성년");
        }
    }
}