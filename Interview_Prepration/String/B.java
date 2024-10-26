//Write a function that counts the number of vowels in a given string.

public class B {
    public static void main(String[] args) {
        String str = "abcdefghtjklmnopqrstuvwxyz";

        int count = 0;
        for (char a : str.toCharArray()) {
            if ("aeiou".indexOf(a) != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
