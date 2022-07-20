package com.accessSpecifieris;

public class ParentClass {

    public String stdName = "James Miller";
    private int stdID  = 1122;
    final int stdContact = 99999999;

    public static void main(String[] args) {
        ParentClass obj = new ParentClass();
        obj.display();
    }

    private void display(){ //public private
        System.out.println("I am display() from ParentClass");
    }

    private void connectDB(){
        //Oracle DB
        System.out.println("Connected to Database");
    }

    protected void connecToServer(){
        System.out.println("Connected to Server");
    }

    final public void displayClassName(){
        System.out.println("ParentClass");
    }

    public void updateStdContact(){
        //stdContact = 99999999;
    }
}
