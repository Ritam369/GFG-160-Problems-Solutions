public class CountInversion {
        // Function to count inversions in the array.
        static int inversionCount(int arr[]) {
            // Your Code Here
            int l = 0;
            int h = arr.length - 1;
            int[] temp = new int[arr.length];
            int[] invCnt = new int[1];
            mergeSort(arr, l, h, temp, invCnt);
            return invCnt[0];
        }
        
        static void mergeSort(int[] arr, int l, int h, int[] temp, int[] invCnt){
            if(l >= h){
                return;
            }
            
            int mid = (l + h) / 2;
            mergeSort(arr, l, mid, temp, invCnt);
            mergeSort(arr, mid + 1, h, temp, invCnt);
            merge(arr, l, mid, h, temp, invCnt);
        }
        
        static void merge(int[] arr, int l, int mid, int h, int[] temp, int[] invCnt){
            int i = l;
            int j = mid + 1;
            int k = l;
            while(i <= mid && j <= h){
                if(arr[i] <= arr[j]){
                    temp[k++] = arr[i++];
                }
                else{
                    invCnt[0] += mid - i + 1;
                    temp[k++] = arr[j++];
                }
            }
            
            while(i <= mid){
                temp[k++] = arr[i++];
            }
            
            while(j <= h){
                temp[k++] = arr[j++];
            }
            
            for(int z = l; z <= h; ++z){
                arr[z] = temp[z];
            }        
        }    
}
