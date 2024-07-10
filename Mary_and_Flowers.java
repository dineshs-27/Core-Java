package Java_Basic_Programs;
public class Mary_and_Flowers {
    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 2, 4, 5, 7, 10};
        int t = 5;
        int end = arr[t] - 1;
        System.out.println("Flowers to be collected: ");
        flowers(arr, end, t);
    }

    private static void flowers(int[] arr, int end, int t) {
        for(int i = 0 ; i <= end; i++){
            for(int j = i+1; j <= end; j++){
                if(arr[i] + arr[j] == t){
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}