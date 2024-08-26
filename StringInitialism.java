import java.util.Scanner;

public class StringInitialism {

    public static String getInitialism(String name) {
        StringBuilder initials = new StringBuilder();
        String[] words = name.trim().split("\\s+");

        for (String word : words) {
            if (word.isEmpty()) {
                initials.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        return initials.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(getInitialism(name));
        sc.close();
    }
}
