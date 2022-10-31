package Learn;

public class ElmntChk {
    public static void main(String[] args) {
        ElmntChk obj = new ElmntChk();
        obj.Lrg();
        obj.Sml();
    }
    public void Lrg(){
    int num[] = {100,1070,876,573,233,546,35};
        int x = num[0];
        for(int i=1; i<num.length; i++){
            if(x<num[i]){
                x = num[i];
            }
        }
        System.out.println("Largest Number : " + x);
    }

    public void Sml(){
        int num[] ={26,3,27,16,2};
        int x = num[0];
        for(int i=1; i<num.length; i++){
            if(x>num[i]){
                x = num[i];
            }
        }
        System.out.println("Smallest Number : " + x);
    }
}