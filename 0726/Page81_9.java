import java.util.Scanner;

public class Page81_9 {
    public static void main(String[]args) {
        int a, b, c;
        char d;

        try (Scanner s = new Scanner(System.in)) {
            System.out.print("전공 이수 학점 : ");
            a = s.nextInt();

            System.out.print("교양 이수 학점 : ");
            b = s.nextInt();

            System.out.print("일반 이수 학점 : ");
            c = s.nextInt();
        }
        d = ((a >= 70 && ((b >= 30 && c >= 30) || (b + c >= 80))) && (a + b + c >= 140)) ? ' ' : '불';

        System.out.println("졸업 " + d +"가능");
    }
}
