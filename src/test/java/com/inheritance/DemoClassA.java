package com.inheritance;

public class DemoClassA implements DemoInterface{
    String stdName = "James Miller";
    int stdID = 1122;

    public static void main(String[] args) {
        DemoClassA obj = new DemoClassA();
        obj.displayName();
        obj.displayID();
        obj.stdAddress("NewJercy, 1122");
        obj.updateStdID(1000);
        obj.displayID();
    }

    public void displayName(){
        System.out.println(stdName);
    }

    public void displayID(){
        System.out.println(stdID);
    }


    @Override
    public void stdAddress(String address) {
        System.out.println(address);
    }

    @Override
    public void updateStdID(int newStdID) {
        stdID = newStdID;
    }
}
