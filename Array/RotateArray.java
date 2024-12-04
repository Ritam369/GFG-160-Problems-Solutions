import java.util.Scanner;
public class RotateArray {
    // Function to reverse a part of the array
    private static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    // Function to rotate the array to the left by d steps
    public static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n; // In case d is greater than n
        //Reversal Algorithm
        // Reverse the first d elements
        reverse(arr, 0, d - 1);
        // Reverse the remaining n-d elements
        reverse(arr, d, n - 1);
        // Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = ob.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = ob.nextInt();
        }
        System.out.println("Enter the position from where the array will rotate: ");
        int d = ob.nextInt();
        
        // Rotate the array
        rotateArr(a, d);

        System.out.println("Array after rotation: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        ob.close();
    }
}