import java.util.*;
public class BuySellStocks2 {
    public static int maxProfit(int arr[]){
        int net = 0; 
        for (int i = 1; i < arr.length; i++) { 
            if (arr[i] > arr[i - 1]) { 
                net += arr[i] - arr[i - 1]; 
            } 
        } 
        return net;
    }
    public static void main(String as[]){
        int arr[]={4,2,2,2,4};
        System.out.println("Maximum profit: "+maxProfit(arr));
    }
}
