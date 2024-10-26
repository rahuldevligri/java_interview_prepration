//Find kth Largest Element in Array Java
// 5, 8, 12, 7, 6, 2, 4 
// 12, 5, 8, 7, 6, 2, 4
// 12, 8, 5, 7, 6, 2, 4
// 12, 8, 7, 5, 6, 2, 4
// 12, 8, 7, 6, 5, 2, 4 

import java.util.Scanner;

public class E_KthLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = { 5, 8, 12, 7, 6, 2, 4 };
        int kth = sc.nextInt();
        int i;
        for (i = 0; i < kth; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(kth + "th Largest element is: " + a[kth - 1]);
    }
}
