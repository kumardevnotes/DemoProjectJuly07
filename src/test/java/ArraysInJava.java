public class ArraysInJava {

    public static void main(String[] args) {
        int stdId = 100;
        int stdIDs[] = {101, 102, 104, 202}; // 0, 1, 2 ,3 // stdIDs[0] = 101
        /* Indexing in array
         * */

//        for(int i=0; i < stdIDs.length; i++){ // 4;  4 < 4 = false //initialization ; condition; inc/dec
//            System.out.println(stdIDs[i]); //stdIDs[3]
//        }

        System.out.println("completed executing forloop");

//        for (int i=0; i < 20; i++){ //20 < 20
//            System.out.println(i);
//        }

        String stdnames[] = {"James", "Mike", "Rose"};
        for (int i = 0; i < stdnames.length; i++) {
            if (stdnames[i].equals("Mike")) { //if(i%2 == 0); sout (i)
                break;
            } else
                System.out.println(stdnames[i]);
        }
        System.out.println("I will get executed after quitting the forloop above");
    }

}
