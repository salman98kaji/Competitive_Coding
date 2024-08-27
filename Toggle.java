import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence to Toggle: ");
        String toggle = sc.nextLine();
        System.out.println("Toggle sentence is :" + toggleString(toggle));
        sc.close();
    }

    public static String toggleString(String toggle) {
        String sl = " ";
        for (int i = 0; i < toggle.length(); i++) {
            if (Character.isUpperCase(toggle.charAt(i))) {
                sl = sl + Character.toLowerCase(toggle.charAt(i));
            } else {
                sl = sl + Character.toUpperCase(toggle.charAt(i));
            }
        }
        return sl;
    }

}
