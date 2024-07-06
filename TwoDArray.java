package Java_Basic_Programs;

public class TwoDArray {
    public static void TwoD(int mat[][]){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++ ){
                System.out.println(mat[i][j] + " ");
            }
        }
    }
    public static void main(String[] args){
        int mat[][] = {
                {1,2,3,4,},
                {5,6,7,8,},
                {9,10,11,12}
        };
        TwoD(mat);
    }
}