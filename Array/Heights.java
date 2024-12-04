import java.util.Scanner;
import java.util.*;
import java.lang.Math;
public class Heights{
    public static int getMinDiff(int k, int[] arr) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];
        int ma = 0;
        int mi = 0;
        int largest = arr[n - 1] - k;
        int smallest = arr[0] + k;
        for(int i = 0; i < n - 1; ++i){
            mi = Math.min(smallest, arr[i + 1] - k);
            ma = Math.max(largest, arr[i] + k);
            ans = Math.min(ans, ma - mi);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k=ob.nextInt();
        System.out.println(getMinDiff(k,arr));
        ob.close();
    }
}

