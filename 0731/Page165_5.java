class Line {
    private int line;

    public Line(int line) {
        this.line = line;
    }

    public boolean isSameLine(Line l) {
        if(l.line == line) {
            return true;
        } else {
            return false;
        }
    }
}

public class Page165_5 {
    public static void main(String[]args) {
        Line a = new Line(1);
        Line b = new Line(1);

        System.out.println(a.isSameLine(b));
        System.out.println(a == b);
    }
}
