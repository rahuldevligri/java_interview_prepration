import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class A_Example {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap();
        hm.put(1, "AA");
        hm.put(2, "BB");
        hm.put(3, "CC");
        hm.put(4, "DD");

        System.out.println(hm);// {1=AA, 2=BB, 3=CC, 4=DD}
        System.out.println(hm.get(1));// return provided key's value = AA
        System.out.println(hm.containsKey(2));// true
        System.out.println(hm.containsValue("AA"));// true
        System.out.println(hm.remove(2));// return value of provided key is "BB"
        System.out.println(hm.size());// retum size of map = 3
        System.out.println(hm.values());// return all values = [AA, CC, DD]
        System.out.println(hm.keySet());// return all keys = [1, 2, 3]
        System.out.println(hm.isEmpty());// check map is empty or not...return false
        hm.replace(3, "33"); // replace value and key
        for (Map.Entry e : hm.entrySet()) {
            System.out.println(e);
        }

        HashMap hm2 = new HashMap<>();
        hm2.putAll(hm);
        hm2.put(5, "EE");
        System.out.println(hm2);

        // check specific key contains or not
        if (hm.containsKey(1)) {
            System.out.println(hm.get(1));
        } else {
            System.out.println("Key is not available...");
        }

        // check specific value contains or not
        if (hm2.containsValue("EE")) {
            System.out.println("value is present in the HashMap");
        } else {
            System.out.println("Value is not available...");
        }

        // creates a set view of a given HashMap object
        Set set = hm.entrySet();
        System.out.println(set);

    }
}