package org.col;

public class Staff {
    public static void main(String[] agrs){
        Staff High = new Staff();
        High.stfId();
        High.stfName();
        High.stfDept();
    }
    public void stfId(){
        int stfId = 03;
        System.out.println(stfId);
    }
    public void stfName(){
        String stfName = "Sarasu";
        System.out.println(stfName);
    }
    public void stfDept(){
        String stfDept = "Information Technology";
        System.out.println(stfDept);
    }
}
