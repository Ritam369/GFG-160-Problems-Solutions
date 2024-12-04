public class Kadane {
    public static int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-4, -2, -6, -1, -8};
        int maxSum = maxSubarraySum(arr);
        System.out.println("Maximum subarray sum is: " + maxSum);
    }
}