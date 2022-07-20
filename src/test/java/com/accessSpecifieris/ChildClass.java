package com.accessSpecifieris;

public class ChildClass extends ParentClass{ //child vs parent or subclass vs superclass
    public static void main(String[] args) {
        ChildClass myObj = new ChildClass();
        myObj.connecToServer();
        myObj.displayClassName();
    }

     public void connecToServer(){
        System.out.println("Connected to Server from ChildClass");
         System.out.println("Connection o server closed");
    }

}
