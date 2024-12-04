public class CircularSubarray {
    public static int maxCircularSum(int arr[]) {
        int f = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                f += 1;
                break;
            }
        }
        // If all elements are negative, return the maximum single element
        if (f == 0) {
            int maxSum = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                maxSum = Math.max(maxSum, arr[i]);
            }
            return maxSum;
        } else {
            // Find the maximum subarray sum using Kadane's algorithm
            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;
            for (int i = 0; i < arr.length; i++) {
                currentSum = Math.max(arr[i], currentSum + arr[i]);
                maxSum = Math.max(maxSum, currentSum);
            }
            // Find the maximum circular subarray sum

            //Find the Original Array sum and invert the array as well
            int arrSum = 0;
            for (int i = 0; i < arr.length; i++) {
                arrSum += arr[i];
                arr[i] = -arr[i];
            }
            //Find the maximum subarray sum on the inverted array. This corresponds to the 
            //minimum subarray sum on the original array.
            int maxInvertedSum = Integer.MIN_VALUE;
            currentSum = 0;
            for (int i = 0; i < arr.length; i++) {
                currentSum = Math.max(arr[i], currentSum + arr[i]);
                maxInvertedSum = Math.max(maxInvertedSum, currentSum);
            }
            
            int maxCircularSum = arrSum + maxInvertedSum; // Reverting the inversion effect
            
            return Math.max(maxSum, maxCircularSum);
        }
    }

    public static void main(String as[]) {
        int arr[] = {-7, 32, -11, 21, 18, 35, -26, -17, 35, -12, -38, -33, 32, 16, 44, 11, -40, -21, 2, 27, -35, 21, -37, -12, 1};
        int result = maxCircularSum(arr);
        System.out.println("Maximum circular subarray sum: " + result);
    }
}
