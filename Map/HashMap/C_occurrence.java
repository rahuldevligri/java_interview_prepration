
/*
    input = "AABBAACCAA"
    output = A6B2C2
 */
import java.util.HashMap;
import java.util.Map;

public class C_occurrence {
    public static void main(String[] args) {
        String str = "AABBAACCAA";
        Map<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (hm.containsKey(str.charAt(i))) {
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
            } else {
                hm.put(str.charAt(i), 1);
            }
        }
        hm.forEach((key, value) -> System.out.print(key + "" + value));
    }
}
