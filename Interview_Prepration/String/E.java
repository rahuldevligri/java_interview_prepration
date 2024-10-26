//Java String program to check whether a string is a Palindrome

public class E {
    public static void main(String[] args) {
        String str = "abba";
        String newStr = new String();
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        if (str.equals(newStr)) {
            System.out.println("palidrome");
        } else {
            System.out.println("not");
        }
    }
}
