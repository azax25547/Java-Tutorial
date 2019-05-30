public class StringDemo {
    public static void main(String[] args) {
        String str,str1,str2;
        str = "Hello World";
        str1 = "Hello World";
        str2 = "Lol";
        // Methods of the String Class
        // Length of the String
        System.out.println(str.length());
        // return indexValue of the character in the String
        System.out.println(str.charAt(1));
        // Compare two strings
        boolean equal = str.equals(str2);
        System.out.println(equal);
    }
}
