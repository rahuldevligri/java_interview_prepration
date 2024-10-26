/*
1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
public class NP_9 {
    public static void main(String[] args) {
        int row = 7;
        for (int i = 1; i < row * 2; i++) {
            for (int j = 1; j <= row; j++) {
                if (i > row && j <= (row * 2) - i) {
                    System.out.print(j + " ");
                } else if (i <= row && j <= i) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
