/*Pattern 6 :
7 6 5 4 3 2 1
7 6 5 4 3 2
7 6 5 4 3
7 6 5 4
7 6 5
7 6
7
 */
public class NP_6 {
    public static void main(String[] args) {
        int row = 7;
        for (int i = 1; i <= row; i++) {
            for (int j = row; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
