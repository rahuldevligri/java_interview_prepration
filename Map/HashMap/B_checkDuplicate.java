
//Write a Java program to Checking duplicate key insertion in HashMap
import java.util.Map;
import java.util.HashMap;

public class B_checkDuplicate {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap();
        hm.put(1, "Rahul");
        hm.put(2, "Rohit");
        hm.put(3, "Kanishk");
        hm.put(2, "Ramkesh");

        System.out.println("Key " + "Value");
        for (Map.Entry e : hm.entrySet()) {
            System.out.print(e.getKey() + "   ");
            System.out.println(e.getValue());
        }
    }
}
