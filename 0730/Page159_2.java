class Printer {
    private int numOfPapers;

    public Printer(int n) {
        numOfPapers = n;
    }

    public void print(int amount) {
        if(numOfPapers >= amount) {
            numOfPapers -= amount;
            System.out.println(amount + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");
        } else if(numOfPapers < amount) {
            numOfPapers -= amount;
            System.out.println("모두 출력하려면 용자가 " + (amount - numOfPapers) + "매 부족합니다. " + numOfPapers + "장만 출력합니다.");
        } else if(numOfPapers <= 0) {
            System.out.println("용지가 없습니다.");
        }
    }
}

public class Page159_2 {
    public static void main(String[]args) {
        Printer p = new Printer(10);

        p.print(2);
        p.print(20);
        p.print(10);
    }
}