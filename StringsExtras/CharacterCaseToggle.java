import java.util.Scanner;

public class CharacterCaseToggle {
    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) result.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch)) result.append(Character.toUpperCase(ch));
            else result.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(toggleCase(str));
    }

}
