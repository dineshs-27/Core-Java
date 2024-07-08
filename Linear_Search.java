package Java_Basic_Programs;

public class Linear_Search {
    public static int search(int nums[], int l, int x){
        for(int i = 0; i < l; i++){
            if(nums[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int nums[] = {0,1,2,3,4,5,6,7,8,9};
        int l = nums.length;
        int x = 11;
        int result = search(nums, l, x);

        if(result == -1){
            System.out.println("Element is not present in array");
        }
        else{
            System.out.println("Element is present at index " + result);
        }
    }
}