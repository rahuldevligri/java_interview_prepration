//How to Perform List to Set Conversion in Java?

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class D_conversion {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        Set<Integer> ts = new HashSet<Integer>(al);
        ts.addAll(al);

    }
}
