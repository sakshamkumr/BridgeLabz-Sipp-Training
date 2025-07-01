import java.util.Scanner;

public class RemoveCharacter {
    public static String removeCharacter(String str, char remove) {
        return str.replaceAll(String.valueOf(remove), "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char remove = sc.next().charAt(0);
        System.out.println(removeCharacter(str, remove));
    }
}
