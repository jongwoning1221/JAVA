import java.util.Scanner;

public class Page80_3 {
    public static void main(String[]args) {
        int a, b;

        try (Scanner s = new Scanner(System.in)) {
            System.out.print("원기둥의 밑면 반지름은 ? : ");
            a = s.nextInt();


            System.out.print("원기둥의 밑면 반지름은 ? : ");
            b = s.nextInt();
        }

        System.out.print("원기둥의 부피는 " + (a * a) * b * 3.14);
    }
}