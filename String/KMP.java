import java.util.*;
public class KMP {
static void computeLPS(String pat, int[] lps, int M){
        int j = 0;
        int i = 1;
        while(i < M){
            if(pat.charAt(i) == pat.charAt(j)){
                lps[i] = j + 1;
                ++j;
                ++i;
            }
            else{
                if(j != 0){
                j = lps[j - 1];
                }
                else{
                    lps[i] = 0;
                    ++i;    
                }
            }
        }
}
static ArrayList<Integer> search(String pat, String txt) {
        // your code here
        int N = txt.length();
        int M = pat.length();
        int[] lps = new int[M];
        computeLPS(pat, lps, M);
        int i = 0;
        int j = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while(i < N){
            if(txt.charAt(i) == pat.charAt(j)){
                ++i;
                ++j;
            }
            else{
                if(j != 0){
                    j = lps[j - 1];
                }
                else{
                    ++i;
                }
            }
            
            if(j == M){
                res.add(i - j);
                j = lps[j - 1];
            }
        }
        
        return res;
}
public static void main(String as[]){
            Scanner ob=new Scanner(System.in);
            System.out.print("Enter the main string: ");
            String str = ob.next();
            System.out.print("Enter the pattern string: ");
            String pat = ob.next();
            ArrayList<Integer> result=new ArrayList<Integer>(search(str,pat));
            System.out.print("Patterns found at: "+result);
        }
}