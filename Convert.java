package Learn;

public class Convert {
    public static void main(String[] args){
        String x = "425";
        Convert obj = new Convert();
        for(int i = 0; i<x.length();i++) {
            int n = Character.getNumericValue(x.charAt(i));
            obj.print(n);
        }
    }

    public void print(int x){
        switch (x) {
            case 1 :
                System.out.print("one ");
                break;
            case 2 :
                System.out.print("Two ");
                break;
            case 3 :
                System.out.print("Three ");
                break;
            case 4 :
                System.out.print("Four ");
                break;
            case 5 :
                System.out.print("Five ");
                break;
        }

    }
}
