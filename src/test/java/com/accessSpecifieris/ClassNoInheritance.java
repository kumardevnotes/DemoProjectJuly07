package com.accessSpecifieris;

public class ClassNoInheritance extends ParentClass{
    public static void main(String[] args) {

//        ParentClass obj = new ParentClass();
//        obj.displayClassName();
//        obj.connecToServer();

        ClassNoInheritance childClassObj = new ClassNoInheritance();
        childClassObj.connecToServer();
        childClassObj.displayClassName();

    }
}
