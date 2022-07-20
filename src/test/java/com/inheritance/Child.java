package com.inheritance;

public class Child extends Parent{

    int batchID = 1002;

    public static void main(String[] args) {
        Child myObj  = new Child();
        myObj.displayMessage_ChildClass();
        myObj.displayData_ChildClass();

        myObj.displayCustomMessage_Parentclass("QA");
        myObj.displayGenericMessage_ParentClass();
    }

    public void displayMessage_ChildClass(){
        System.out.println("This message is from child class");
    }

    public void displayData_ChildClass(){
        System.out.println(this.batchID);
        //System.out.println(super.batchID);
    }
}
