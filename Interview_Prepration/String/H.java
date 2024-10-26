/*Java String Program to Swapping Pair of Characters
Input: str = "GeeksForGeeks"

Output: eGkeFsroeGkes

Explanation: Swap Pair of Characters 
                        Pairs to Swap: {G e} , {e k} , { s F } , { o r } , { G e } , { e k } , { s }
                        After Swap: { e G } , { k e } , { F s } , { r o } , { e G } , { k e } , { s }
                        Result: "eGkeFsroeGkes"
*/
public class H {
    public static void main(String[] args) {
        String str = "GeeksForGeeks";
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length - 1; i += 2) {
            char temp = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = temp;
        }
        String str1 = new String(ch);
        System.out.println(str1);
    }
}
