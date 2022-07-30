import java.util.Scanner;

public class Page125_10 {
    public static void main(String[]args) {
        System.out.print("양의 정수를 입력하세요. : ");
        int num = new Scanner(System.in).nextInt();
        if(isPrime(num)) {
            System.out.println(num + "는 소수입니다.");
        } else {
            System.out.println(num + "는 소수가 아닙니다.");
        }
    }

    public static boolean isPrime(int a) {
        if(a <= 1) {
            return false;
        }

        for(int i = 2; i < a; i++) {
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }
}