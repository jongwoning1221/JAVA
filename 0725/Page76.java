import java.util.Scanner;

public class Page76 {
    public static void main(String[]args) {
        
        int a;

        try (Scanner s = new Scanner(System.in)) {
            System.out.print("정수를 입력하세요 : ");

            a = s.nextInt();
        }
        if(a % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
}