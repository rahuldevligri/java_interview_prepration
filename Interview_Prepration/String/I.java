/* Java String Program to Replace a Character at a Specific Index
Input: str = "Geeks for geeks" , index = 10 , ch = 'G'

Output: "Geeks for Geeks"

Explanation:  String str is "Geeks for geeks" , as we can see index 10 refers to "Geeks for geeks" this element . So , we will replace it with 'G'.
                         Result becomes "Geeks for Geeks"
 */
public class I {
    public static void main(String[] args) {
        String str = "Geeks for geeks";
        int index = 10;
        char newCh = 'G';
        char[] ch = str.toCharArray();

        ch[index] = newCh;
        String str2 = new String(ch);
        System.out.println(str2);

        StringBuffer sb = new StringBuffer(str);
        sb.setCharAt(index, newCh);
        System.out.println(sb);
    }
}
