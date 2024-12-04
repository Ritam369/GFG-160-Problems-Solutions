public class Majority {
    public static void main(String as[]){
        int arr[]={1,2,1,4,1,2,1,4,1,9};
        int el=0,ct=0;
        for(int i=0;i<arr.length;i++){
            if(ct==0){
                el=arr[i];
                ct=1;
            }
            else if(el==arr[i])
                ct++;
            else
                ct--;
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(el==arr[i])
                count++;
        }
        if(count>arr.length/3)
            System.out.println("Majoirity element "+el);
        else    
            System.out.println("Majoirity element doesn't contain");
    }
}
