public static int minChar(String s) {
        // Write your code here
        
        String rev = new StringBuilder(s).reverse().toString();
        String newStr =  s + "$" + rev;
        int[] lps = computeLPS(newStr);
        int N = newStr.length();
        return s.length() - lps[N - 1];
        
    }
    
    static int[] computeLPS(String newStr){
        int N = newStr.length();
        int j = 0;
        int i = 1;
        int[] lps = new int[N];
        lps[0] = 0;
        while(i < N){
            if(newStr.charAt(i) == newStr.charAt(j)){
                lps[i] = j + 1;
                ++i;
                ++j;
            }
            else{
                if(j != 0){
                    j = lps[j - 1];
                }   
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
        
    }