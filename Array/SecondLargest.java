import java.util.*;
class SecondLargest {
    public static int getSecondLargest(int[] arr) {
       int largest=Integer.MIN_VALUE;
       int slargest=Integer.MIN_VALUE; //-infinity
       for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            if(arr[i]>slargest && arr[i]!=largest)
                slargest=arr[i];
       }
       if(slargest==Integer.MIN_VALUE)
            return -1; //if no second largest element exists
        else
            return slargest;
    }

    public static void main(String as[]){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=ob.nextInt();
        System.out.print("Second Largest: "+getSecondLargest(arr));
    }
}