import java.util.Scanner;

public class Anagram {
    public static boolean areAnagrams(String str1, String str2) {
        char[] a = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] b = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);
        return java.util.Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(areAnagrams(str1, str2));
    }
}
