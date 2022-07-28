import java.util.Scanner;

public class Page80_2 {
    public static void main(String[]args) {
        int a, b;

        try (Scanner s = new Scanner(System.in)) {
            System.out.print("정수를 입력하세요 : ");
            a = s.nextInt();
        }
        b = a * a;

        System.out.println(a + " 의 제곱은 " + b);
    }
}