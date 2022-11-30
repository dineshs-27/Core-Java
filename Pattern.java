package Learn;

public class Pattern {
    public static void main(String[] args) {
        Pattern obj = new Pattern();
        obj.P1();
        obj.P2();
        obj.P3();
    }

    public void P1() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public void P2(){
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public void P3() {
        for (int i=1; i<=3; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 2 && j == 2 || i == 2 && j == 3) {
                    System.out.print(" \t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
