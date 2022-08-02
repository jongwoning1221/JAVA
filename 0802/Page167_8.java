class Dice {
    double a;

    public Dice() {
        this.a = a;
    }

    public int roll() {
        this.a = ((Math.random() * 10 % 6) + 1);
        return (int) a;
    }
}

public class Page167_8 {
    public static void main(String[]args) {
        Dice d = new Dice();
        System.out.println("주사위의 숫자 : " + d.roll());
    }
}
