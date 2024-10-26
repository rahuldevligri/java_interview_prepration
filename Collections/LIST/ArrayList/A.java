import java.util.*;

public class A {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("A"); // add elements in ArrayList
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("F");
        al.add("G");
        al.add("H");

        // print arraylist all elements
        System.out.println(al);

        al.set(0, "a"); // update element a at 0th position
        System.out.println(al);

        al.add(1, "b");// add b element at 1th position
        System.out.println(al);

        al.remove(4);// remove 4th element in ArrayList
        System.out.println(al);

        Collections.sort(al);// sort ArrayList
        System.out.println(al);

        // Collections.shuffle(al);// Shuffle arraylist
        // System.out.println(al);

        al.ensureCapacity(7);// min capacity of arraylist is 7
        System.out.println(al);

        Collections.reverse(al);// reverse ArrayList
        System.out.println(al);

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("A");
        al2.add("B");
        al2.add("C");
        al2.add("D");

        System.out.println(al.containsAll(al2));

        // compare 2 ArrayList
        ArrayList<String> compare = new ArrayList<String>();
        for (String e : al) {
            compare.add(al2.contains(e) ? "True" : "False");
        }
        System.out.println(compare);

        // Swap 2 element
        System.out.println(al);
        Collections.swap(al, 1, 3);
        System.out.println(al);

        // join 2 array list
        ArrayList<String> join = new ArrayList<String>();
        join.addAll(al);
        join.addAll(al2);
        System.out.println(join);

        // empty an arraylist
        join.removeAll(join);
        System.out.println(join);

        // retrieve an element
        System.out.println(al.get(5));

        // update an element
        al.set(2, "h");
        System.out.println(al);

        // search an element
        if (al.contains("x")) {
            System.out.println("elemetn found");
        } else {
            System.out.println("Element doesn't found");
        }

    }
}
