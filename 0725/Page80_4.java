import java.util.Scanner;

public class Page80_4 {
    public static void main(String[]args) {
        int a, b, c, d;

        try (Scanner s = new Scanner(System.in)) {
            System.out.print("초 단위로 정수를 입력하세요 : ");
            a = s.nextInt();
        }
        b = a / 60 / 60;

        c = (a - (60 * 60 * b)) / 60;

        d = a % 60;

        System.out.print(b + "시간 " + c + "분 " + d + "초");
    }
}