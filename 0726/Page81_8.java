import java.util.Scanner;

public class Page81_8 {
    public static void main(String[]args) {
        int a;

        try (Scanner s = new Scanner(System.in)) {
            System.out.print("정수를 입력하세요. : ");
            a = s.nextInt();
        }
        System.out.println((a/100) + ((a%100)/10) + (a%10));
    }
}
