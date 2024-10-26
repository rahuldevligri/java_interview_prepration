
//Java Program to Compare Elements in a Collection
/*
Input : List = [3, 5, 18, 4, 6]
Output:
Min value of our list : 3
max value of our list : 18

Input : List = ['a', 'a', 'a']
Output:
All elements are equal
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class A_Compare_elements {
    public static void main(String[] args) {
        // List initialization
        List<Integer> al = new ArrayList<>();

        // Add elements in the list
        al.add(3);
        al.add(5);
        al.add(18);
        al.add(4);
        al.add(6);
        // Minimum in the list
        int minimum = Collections.min(al);

        // Maximum in the list
        int maximum = Collections.max(al);

        if (minimum == maximum) {
            System.out.println("All elements are equal");
        } else {
            System.out.println("Min value of our list : "
                    + minimum);
            System.out.println("Max value of our list : "
                    + maximum);
        }
    }
}
