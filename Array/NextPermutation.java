import java.util.*;
public class NextPermutation {
    public static void rev(int arr[], int str, int end){
        while (str < end) {
            int temp = arr[end];
            arr[end] = arr[str];
            arr[str] = temp;
            str++;
            end--;
        }
    }

    public static void nextPermutation(int arr[]) {
        int ind = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i + 1] > arr[i]) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            // Reverse the entire array if it's the last permutation
            rev(arr, 0, arr.length - 1);
            return;  // Make sure to return here
        }
        for (int i = arr.length - 1; i > ind; i--) {
            if (arr[i] > arr[ind]) {
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                break;
            }
        }
        // Reverse the part of the array after the pivot
        rev(arr, ind + 1, arr.length - 1);
    }

    public static void main(String as[]){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = ob.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++)
            arr[i] = ob.nextInt();
        nextPermutation(arr);
        System.out.print("Next permutation: ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
