import java.util.Scanner;

public class Page81_6 {
    public static void main(String[]args) {
        double a, b;

        try (Scanner s = new Scanner(System.in)) {
            System.out.print("화씨온도를 입력하세요. : ");
            a = s.nextDouble();
        }
        b = (a -32) * 5/9;

        System.out.println("화씨온도" + a + "Ｆ는 섭씨온도 " + b + "℃ 입니다.");
    }
}
