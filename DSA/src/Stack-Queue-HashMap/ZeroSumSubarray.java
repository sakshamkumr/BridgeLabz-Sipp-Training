import java.util.*;

public class ZeroSumSubarray {
    public static void findSubarrays(int[] arr) {
        Map<Integer, List<Integer>> sumIndices = new HashMap<>();
        int sum = 0;
        sumIndices.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sumIndices.containsKey(sum)) {
                for (int start : sumIndices.get(sum)) {
                    System.out.println("Subarray: " + (start + 1) + " to " + i);
                }
            }
            sumIndices.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findSubarrays(arr);
    }
}
