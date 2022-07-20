public class DemoClass08 {
    String stdname= "KumarLearner";
    int stdAge = 20;

    DemoClass08(){
        System.out.println("I am constructor. And I will run ASA you create an object");
    }

    public static void main(String[] args) {
        DemoClass08 stdObject = new DemoClass08();
        System.out.println(stdObject.stdname);
        System.out.println(stdObject.stdAge);
        stdObject.displayMessage();
        System.out.println(stdObject.getStdFee());
        stdObject.displayStudentName("Akeem", 24);
    }

    public void displayMessage(){
        System.out.println("Hello..Welcome to the QA class");
    }

    public void displayStudentName(String studentName, int stgAge){
        System.out.println(studentName);
        System.out.println(stgAge);
    }

    public int getStdFee(){
        return 1000;
    }
}
