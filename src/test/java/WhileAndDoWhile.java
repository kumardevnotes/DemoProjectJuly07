public class WhileAndDoWhile {
    public static void main(String[] args) {
        int i = 10;
        while(i > 0){ //0 > 0 = false
            System.out.println(i); //10 . 9
            i--; //10-1 = 9 . 8 .7....0
        }

        do{
            System.out.println(i);
            i--;
        } while( i > 0);
    }
}
