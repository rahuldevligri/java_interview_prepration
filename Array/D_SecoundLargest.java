public class D_SecoundLargest {
    public static void main(String[] args) {
        int[] arr = { 6, 8, 2, 4, 3, 1, 5, 7 };
        int l = Integer.MIN_VALUE; // -214748
        int s = Integer.MIN_VALUE; // -214748

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > l) {
                s = l; // s = -214748 | s = 6 |
                l = arr[i];// l = 6 | l = 8 |
            } else if (arr[i] > s && arr[i] != l) {
                s = arr[i];// s = 7
            }
        }
        if (s == Integer.MIN_VALUE) {
            System.out.println("There is no 2nd largest element");
        } else {
            System.out.println(s);// s = 7
        }
        System.out.println(l);// l = 8
    }
}
