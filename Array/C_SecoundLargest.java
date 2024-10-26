//find 2nd largest element 
public class C_SecoundLargest {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 4, 7, 9 };

        int max = arr[0], secound = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max) {
                secound = max;
                max = arr[i];
            }
        System.out.println("2nd Largest Element is " + secound);
    }
}
