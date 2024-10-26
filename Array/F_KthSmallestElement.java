//Find kth Smallest Element in Array Java.
// 5, 8, 12, 7, 6, 2, 4 
// 2, 8, 12, 7, 6, 5, 4 <-1
// 2, 4, 12, 8, 7, 6, 5 <-2
// 2, 4, 5, 12, 8, 7, 6 <-3
// 2, 4, 5, 6, 12, 8, 7 <-4

import java.util.Scanner;

public class F_KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = { 5, 8, 12, 7, 6, 2, 4 };
        int kth = sc.nextInt();

        for (int i = 0; i < kth; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(kth + "th Smallest element is: " + a[kth - 1]);
    }
}
