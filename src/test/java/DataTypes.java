public class DataTypes {
    static boolean isDisplayed;
    static char myChar;
    static int myID;
    static String myName;
    static float myFloat;
    static double myDouble;

    public static void main(String[] args) {
        System.out.println(isDisplayed);
        System.out.println(myChar);
        System.out.println(myID);
        System.out.println(myName);
        System.out.println(myFloat);
        System.out.println(myDouble);
        isDisplayed = true;
        myChar= 'A';
        myID=112233;
        myName="kumar";
        myFloat= (float) 100.45767676767676;
        myDouble = 300.4545454656565656565;
        System.out.println("====================");
        System.out.println(isDisplayed);
        System.out.println(myChar);
        System.out.println(myID);
        System.out.println(myName);
        System.out.println(myFloat);
        System.out.println(myDouble);
    }
}
