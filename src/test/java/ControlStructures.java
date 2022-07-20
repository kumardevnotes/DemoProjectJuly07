public class ControlStructures {

    static boolean displayDetails = true; //false
    static int mainID = 101;
    static char mainChar = 'c';

    String name = "Kumar QA";

    public static void main(String[] args) {

        if(mainID==100 || mainChar =='z' && true){ //false || false - false
            System.out.println("Kumar QA");
            System.out.println("112233");
            System.out.println("Hyderabad");
        }
        else{
            System.out.println("Can not diplay student details at the moment");
        }
        System.out.println("I will be executed without depending on if..");

        //System.out.println("Hello"); Single line comment in java
        /*System.out.println("multilines1");
        System.out.println("multilines2");
        System.out.println("multilines3");
        System.out.println("multilines4");
        System.out.println("multilines5"); */

        /*AND Operator - && - you need to have min 2 conditions
        true && true - true
        true && false - false
        false && true - false
        false && false - false
        * */

         /*OR Operator - || - you need to have min 2 conditions
        true || true - true
        true || false - true
        false || true - true
        false || false - false
        * */
    }
}
