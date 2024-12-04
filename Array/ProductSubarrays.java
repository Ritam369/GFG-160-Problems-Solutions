import java.util.*;
public class ProductSubarrays {
    public static int productSubarrays(int arr[]){
        int maxi=Integer.MIN_VALUE;
        int prefix=arr[0];
        int suffix=arr[arr.length-1];
        for(int i=0;i<arr.length;i++){
            if(prefix==0)
                prefix=1;
            if(suffix==0)
                suffix=1;
            prefix*=arr[i];
            suffix*=arr[arr.length-i-1];
            maxi=Math.max(maxi,Math.max(prefix,suffix));
        }
        return maxi;  // Returning the maximum product found.
    }
    public static void main(String as[]){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n=ob.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the Array: ");
        for(int i=0;i<n;i++){
            a[i]=ob.nextInt();
        }
        System.out.println("The Maximum Product of all from all Subarrays is: "+productSubarrays(a));
    }
}
