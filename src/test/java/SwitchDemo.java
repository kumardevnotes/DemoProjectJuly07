public class SwitchDemo {
    static String day ="January"; //static int stdID = 1122;
    public static void main(String[] args) {
        switch(day){
            case "Sunday": //case 1122
                System.out.println("It is Sunday");
                break;
            case "Monday":
                System.out.println("It is Monday");
                break;
            case "SatDay":
                System.out.println("It is SatDay");
                break;
            default:
                System.out.println("Please check the cases and pass a valid day");
        }
        System.out.println("I am outside the Switch() block");
    }
}
