/*Java Program to Remove a Specific Element From a Collection

Input: ArrayList : [10, 20, 30, 1, 2]
            Index: 1 
Output: ArrayList : [10, 30, 1, 2]
Explanation: Removed element from index 1.
 */

import java.util.ArrayList;
import java.util.List;

public class B_Remove_element {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(30);
        al.add(1);
        al.add(2);

        System.out.println(al);

        al.remove(1);
        System.out.println(al);

        // This makes a call to remove(Object) and
        // removes element 2
        al.remove(new Integer(2));
        System.out.println(al);
    }
}
