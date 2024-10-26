//Write a function that takes a string as input and returns the reversed string.

public class A {
    public static void main(String[] args) {
        String str = "ABCD";
        String rts = new StringBuffer(str).reverse().toString();
        System.out.println(str + " " + rts);

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
