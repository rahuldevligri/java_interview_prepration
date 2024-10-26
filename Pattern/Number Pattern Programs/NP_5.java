/* Pattern 5 :
7
7 6
7 6 5
7 6 5 4
7 6 5 4 3
7 6 5 4 3 2
7 6 5 4 3 2 1
 */
public class NP_5 {
    public static void main(String[] args) {
        int row = 7;
        for (int i = row; i >= 1; i--) {
            for (int j = row; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
