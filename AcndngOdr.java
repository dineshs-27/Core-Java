package Learn;

public class AcndngOdr {
    public static void main(String[] args){
        int arr[] = new int[] {5,4,3,2,1};
        int temp;
        System.out.println("Elements of Original array : ");
        for(int x=0; x<arr.length; x++){
            System.out.print(arr[x] + " ");
        }
        for(int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of Ascending array : ");
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j] + " ");
        }
    }
}
