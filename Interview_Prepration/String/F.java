//Java String Program to Check Anagram
/*Input: str1 = "Listen" 
            str2 = "Silent"

Output: Yes

Explanation: A string is called Anagram of other string when the it contains the same characters, only the order of characters can be different.
                        Example Listen ->  E:1 , I:1 , L: 1 , N:1 , S:1 , T:1  
                                         Silent ->  E:1 , I:1 , L: 1 , N:1 , S:1 , T:1  

                        As the occurence of elements are same in both the String hence they are anagram of each other.
 */

import java.util.Arrays;

public class F {
    public static void main(String[] args) {
        String str_1 = "Listen";
        String str_2 = "Silent";

        char[] arr_1 = str_1.toLowerCase().toCharArray();
        char[] arr_2 = str_2.toLowerCase().toCharArray();

        // int cnt = 0, i = 0;
        // if (arr_1.length == arr_2.length) {
        // for (i = 0; i < arr_1.length; i++) {
        // for (int j = 0; j < arr_1.length; j++) {
        // if (arr_1[i] == arr_2[j]) {
        // cnt++;
        // }
        // }
        // }
        // if (cnt != i) {
        // System.out.println("not");
        // } else {
        // System.out.println("anagram");
        // }
        // } else {
        // System.out.println("length isn't equal");
        // }
        Arrays.sort(arr_1);
        Arrays.sort(arr_2);
        boolean flg = true;
        if (arr_1.length == arr_2.length) {
            for (int j = 0; j < arr_1.length; j++) {
                if (arr_1[j] != arr_2[j]) {
                    flg = false;
                    break;
                }
            }
            if (!flg)
                System.out.println("not");
            else
                System.out.println("anagram");
        } else
            System.out.println("length of both strings aren't equal...");
    }
}
