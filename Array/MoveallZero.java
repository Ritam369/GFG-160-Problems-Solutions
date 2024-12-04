import java.util.*;
public class MoveallZero {
    public static void pushZerosToEnd(int[] arr) {
        int ind=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[ind]=arr[i];
                ind++;
            }
        }
        while(ind<arr.length){
            arr[ind]=0;
            ind++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String as[]){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=ob.nextInt();
        pushZerosToEnd(arr);
    }
}