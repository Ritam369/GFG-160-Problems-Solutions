import java.util.*;
public class Anagram {
    public static void check(String s1, String s2){
        if(s1.length()!=s2.length()){
            System.out.println("The strings are not anagrams");
            return;
        }else{
            char[] charArray1 = s1.toLowerCase().toCharArray();
            char[] charArray2 = s2.toLowerCase().toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            if(Arrays.equals(charArray1, charArray2)){
                System.out.println("The strings are anagrams");
            } else{
                System.out.println("The strings are not anagrams");
            }
        }
    }
    public static void main(String as[]){
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = ob.next();
        System.out.print("Enter the second string: ");
        String s2 = ob.next();
        check(s1,s2);
    }
}
