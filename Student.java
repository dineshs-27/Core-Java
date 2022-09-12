package org.col;

public class Student {
    public static void main(String[] args){
        Student Low = new Student();
        Low.stuId();
        Low.stuName();
        Low.stuDept();
    }
    public void stuId(){
        String stuId = "RA2111008020120";
        System.out.println(stuId);
    }
    public void stuName(){
    String stuName = "Dinesh S";
    System.out.println(stuName);
    }
    public void stuDept(){
        String stuDept = "Information Technology";
        System.out.println(stuDept);
    }
}