import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row: ");
        int row = sc.nextInt();
        int s = 2;
        for (int i = 1; i < row * 2; i++) {
            System.out.print(1);
            for (int j = 2; j <= row; j++) {
                if (i > row) {
                    if (j == i - s) {
                        System.out.print(i - s);
                        s += 2;
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (i == j) {
                        System.out.print(i);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
