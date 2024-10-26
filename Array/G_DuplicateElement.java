//Find Duplicate Elements in an Array in Java

public class G_DuplicateElement {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 2, 3, 2 };

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
