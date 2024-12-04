public class ReverseArray {
    public static void rev(int arr[]){
        int str=0,end=arr.length-1;
        while(str<end){
            int temp=arr[end];
            arr[end] = arr[str];
            arr[str] = temp;
            str++;
            end--;
        }
        System.out.println("\nReversed Array:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String as[]){
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        System.out.println("Original Array:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        rev(arr);
    }
}
