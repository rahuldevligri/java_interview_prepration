import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String myStr = "AABBAACCAA";
        System.out.println("String =" + myStr);
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = myStr.length() - 1; i >= 0; i--) {
            if (hashMap.containsKey(myStr.charAt(i))) {
                int count = hashMap.get(myStr.charAt(i));
                hashMap.put(myStr.charAt(i), ++count);
            } else {
                hashMap.put(myStr.charAt(i), 1);
            }
        }
        System.out.println("Counting occurrences of each character = " + hashMap);
    }
}