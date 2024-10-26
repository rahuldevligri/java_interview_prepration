//Java String Program to Insert a String into Another String

public class D {
    public static void main(String[] args) {
        String oldStr = "Rahul ligri";
        String addStr = "Dev";
        int index = 5;

        String newStr = new String();

        for (int i = 0; i < oldStr.length(); i++) {
            newStr += oldStr.charAt(i);// Rahul //ligri
            if (i == index) {// 5==5
                newStr += addStr;// Dev
            }
        }
        System.out.println(newStr);// Rahul Devligri
    }
}
