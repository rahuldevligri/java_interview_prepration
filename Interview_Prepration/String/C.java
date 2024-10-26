//Java String Program to Print Even-Length Words
/* Ex -> This is a java
output -> this is java 
 */
public class C {
    public static void main(String[] args) {
        String str = "This is a Java Program";
        String[] words = str.split(" ");
        for (String i : words) {
            if (i.length() % 2 == 0) {
                System.out.print(i);
            }
        }
    }
}
