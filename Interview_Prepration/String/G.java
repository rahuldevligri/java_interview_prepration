/*Java String Program to Reverse a String
Input: "Geeks"

Output: skeeG 
*/
public class G {
    public static void main(String[] args) {
        String str = "Geeks", rrev = "";
        // 1st
        char ch;
        for (int i = str.length() - 1; i >= 0; i--) {
            ch = str.charAt(i);
            rrev += ch;
        }
        System.out.println(rrev);

        // 2nd
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        System.out.println(sbr);

        // 3rd
        StringBuilder sbd = new StringBuilder(str);
        sbd.reverse();
        System.out.println(sbd);

        // 4th
        char[] chr = str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(chr);
        }
    }
}
