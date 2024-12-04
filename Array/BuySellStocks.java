import java.util.Scanner;
public class BuySellStocks {
    public static void stock(int arr[]){
        int maxProfit=0;
       // int j=-1;
        int buy=arr[0];
        for(int i=1;i<arr.length;i++){
            if(buy<arr[i]){
                maxProfit=Math.max(maxProfit,arr[i]-buy);
            }
            else
                buy=arr[i];
        }
        System.out.println("Maximum Profit: "+maxProfit);
    }
    public static void main(String as[]){
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the price of stock for each day: ");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        stock(arr);
    }
}
