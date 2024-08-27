import java.util.Scanner;

public class reverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String str = sc.nextLine();
        reverseStr(str);
        System.out.println(revStriSwap(str));
        sc.close();

    }

    public static void reverseStr(String str) {
        int n = str.length();
        String rev = "";
        for (int i = n - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }

    public static String revStriSwap(String str) {
        int n = str.length();
        char[] charArray = str.toCharArray();
        int end = n - 1;
        int begin = 0;
        while (begin < end) {
            char temp = charArray[begin];
            charArray[begin] = charArray[end];
            charArray[end] = temp;
            begin++;
            end--;
        }
        return new String(charArray);
    }
}
