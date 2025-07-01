import java.util.Scanner;

public class MostFrequentCharacter {
    public static char mostFrequentChar(String str) {
        int[] freq = new int[256];
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }
        int max = 0;
        char result = ' ';
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                result = (char) i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(mostFrequentChar(str));
    }
}
