import java.util.Scanner;

public class ReplaceWord {
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String newWord = sc.nextLine();
        String oldWord = sc.nextLine();
        System.out.println(replaceWord(sentence, oldWord, newWord));
    }
}
