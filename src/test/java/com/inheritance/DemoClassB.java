package com.inheritance;

public class DemoClassB implements DemoInterface {
    public static void main(String[] args) {
        DemoClassB obj = new DemoClassB();
        obj.stdAddress("NewJercy, 1122");
        obj.updateStdID(1122);
    }

    @Override
    public void stdAddress(String address) {
        String newAddress = "";
        newAddress = address + " 999999";
        System.out.println(newAddress);
    }

    @Override
    public void updateStdID(int stdID) {
        int newID =0;
        newID = stdID+ 100;
        System.out.println(newID);
    }
}
