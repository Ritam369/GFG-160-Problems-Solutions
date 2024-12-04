import java.util.*;
public class SmallestPosMissing {
    public static int missingNumber(int arr[]){
        Arrays.sort(arr);
        int c=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<c)
                continue;
            else if(arr[i]>c)
                continue;
            else if(arr[i]==c){
                c++;
                continue;
            }
            else 
                break;
        }
        return c;
    }
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n=ob.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the Array: ");
        for(int i=0;i<n;i++){
            a[i]=ob.nextInt();
        }
        System.out.println(missingNumber(a));
    }
}
