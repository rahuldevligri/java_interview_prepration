public class test2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 3, 2, 5, 6, 1, 9 };

        int max = arr[0], sec = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                sec = max;
                max = arr[i];
            }
        }
        System.out.println(max + "<- max & 2nd -> " + sec);
    }
}
