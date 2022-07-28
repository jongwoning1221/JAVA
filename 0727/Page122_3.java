import java.util.Scanner;

public class Page122_3 {
    public static void main(String[]args) {
        int a, b = 0;
        
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("정수를 입력하세요. : ");
            a = s.nextInt();

        if (a % 2 == 0 && a > 0) {
            b += a;    
        }

        } while (a > 0);

        System.out.println("입력한 양의 정수의 합 : " + b);
    }
}