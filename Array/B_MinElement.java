//min element
public class B_MinElement {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 3, 10 };

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println(min);
    }
}
