package Learn;

public class Pattern {
    public static void main(String[] args) {
        Pattern obj = new Pattern();
        obj.P1();
    }

    public void P1() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}