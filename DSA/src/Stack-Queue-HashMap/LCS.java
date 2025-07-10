import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LCS {
    public static int findLongest(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);

        int maxLength = 0;
        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int curr = num;
                int length = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Longest sequence length: " + findLongest(arr));
    }
}
