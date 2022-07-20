public class StringMethods {
    static String name  = "james"; //J-0, a-1, m-2, e-3, s-4 (length()-1) (5-1)(4)
    public static void main(String[] args) {
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.equals("John"));
        System.out.println(name.equalsIgnoreCase("James"));
        System.out.println(name.charAt(0));
        System.out.println(name.concat(" Miller")); //james Miller
        System.out.println(name.length()); //length of the string
        System.out.println(name.contains("am"));
        System.out.println(name.endsWith("es"));
        System.out.println(name.isEmpty()); //checks whether the string is empty or not
        System.out.println(name.replace('J', 'H'));
        System.out.println(name.trim()); //James
    }
}
