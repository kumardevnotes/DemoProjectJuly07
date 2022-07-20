public class StaticNonStaticDemo {

    static String stdName = "James";
           int stdID = 1122;

    public static void main(String[] args) {
        //calling a static method without creating class object
        displayMessage(); //calling static method
        System.out.println(stdName); //printing static variable

        //calling a non-static method by creating class object
        StaticNonStaticDemo classObj = new StaticNonStaticDemo();
        classObj.displayName();
        System.out.println(classObj.stdID);

    }

    static void displayMessage(){
        System.out.println("Hello world!");
    }

    void displayName(){
        System.out.println("John Doe");
    }
}
