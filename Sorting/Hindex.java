public class Hindex {
    public int hIndex(int[] citations) {
        // code here
        Arrays.sort(citations);
        int n = citations.length;
        for(int i = 0; i < n; ++i){
            if(citations[i] >= n - i){
                return n - i;
            }
        }
        return 0;
        
    }
}
