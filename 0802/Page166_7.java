class GolfClub {
    int a;
    String b;

    public GolfClub() {
        this.a = 7;
    }

    public GolfClub(int a) {
        this.a = a;
    }


    public GolfClub(String b) {
        this.b = b;
    }

    public void print() {
        if(a > 0) {
            System.out.println(a + "번 아이언입니다.");
        } else {
            System.out.println(b + "입니다.");
        }
    }
}

public class Page166_7 {
    public static void main(String[]args) {
        GolfClub g1 = new GolfClub();
        g1.print();

        GolfClub g2 = new GolfClub(8);
        g2.print();

        GolfClub g3 = new GolfClub("퍼터");
        g3.print();
    }
}
