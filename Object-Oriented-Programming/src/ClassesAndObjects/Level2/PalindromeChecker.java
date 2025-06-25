package ClassesAndObjects.Level2;

import java.util.Scanner;

public class PalindromeChecker {
    String text;
    public PalindromeChecker(String text) {
        this.text = text;
    }
    public PalindromeChecker() {
        text = "";
    }
    public String getText() {
        return text;
    }
    public boolean isPalindrome(PalindromeChecker checker) {
        String a = checker.getText();
        int left = 0;
        int right = a.length() - 1;
        while (left < right) {

            if (a.charAt(left) != a.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();
        checker.text = sc.nextLine();
        System.out.println(checker.isPalindrome(checker));
    }
}
