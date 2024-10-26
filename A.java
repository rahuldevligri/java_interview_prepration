/*
    5,6,4,7,9
    6,5,4,7,9
    7,5,4,6,9
    9,5,4,6,7

    9,6,4,5,7
    9,7,4,5,6
 */
/*
    5,6,4,7,9
    9,5,4,6,7
    9,7,4,5,6
    9,7,6,4,5
    9,7,6,5,4
 */
public class A {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 4, 7, 9 };

        int l = arr[0]; // l = 5 | l = 6 | l = 7 | l = 9
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > l) {
                arr[0] = arr[i]; // 5 = 6 | 6 = 7 | 7 = 9
                arr[i] = l; // 6 = 5 | 7 = 6 | 9 = 7
                l = arr[0];// l = 6 | l = 7 | l = 9
            }
        }
        int s = arr[1];
        for (int j = 2; j < arr.length; j++) {
            if (arr[j] > s) {
                arr[1] = arr[j];// 5 = 6 | 6 = 7
                arr[j] = s; // 6 = 5 | 7 = 6
                s = arr[1];// s = 6 | s = 7
            }
        }
        System.out.println(s); // 7
    }
}