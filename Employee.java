package org.emp;

public class Employee {
    public static void main(String[] args){
        Employee info = new Employee();
        info.empId();
        info.empName();
        info.empDob();
        info.empPhone();
        info.empEmail();
        info.empAddress();
    }
    public void empId(){
        String empId = "RA2111008020120";
        System.out.println(empId);
    }
    public void empName(){
        String empName = "Dinesh S";
        System.out.println(empName);
    }
    public void empDob(){
        String empDob = "27/02/2004";
        System.out.println(empDob);
    }
    public void empPhone(){
        String empPhone = "6379412928";
        System.out.println(empPhone);
    }
    public void empEmail(){
        String empEmail = "dinss0227@gamil.com";
        System.out.println(empEmail);
    }
    public void empAddress(){
        String empAddress = "11/21 Jawaharlal Nehru Street Kalambur 606903";
        System.out.println(empAddress);
    }
}
