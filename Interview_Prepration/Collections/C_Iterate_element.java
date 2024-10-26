//How to Iterate LinkedList in Java?

import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class C_Iterate_element {
    public static void main(String[] args) {
        // Creating a LinkedList of Integer Type
        List<Integer> ll = new LinkedList<Integer>();

        // Inserting some Integer values to our LinkedList
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        // LinkedList after insertions: [1, 2, 3, 4, 5]
        Iterator itr = ll.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        ListIterator litr = ll.listIterator();
        while (litr.hasNext()) {
            System.out.println(litr.next());

        }

        // Calling the forEach function to iterate through
        // all the elements inside the Linked List
        ll.forEach((element) -> System.out.println(element));

        Map<String, String> hm = new HashMap<String, String>();
        // Inserting elements to the adobe HashMap
        // Elements- Key value pairs using put() method
        hm.put("A", "Angular");
        hm.put("J", "Java");
        hm.put("P", "Python");
        hm.put("H", "Hibernate");

        for (Map.Entry<String, String> m : hm.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());

        Map<String, String> lhm = new LinkedHashMap<String, String>();
        lhm.putAll(hm);
        lhm.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
