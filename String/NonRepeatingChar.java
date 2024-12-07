//Brute Force

import java.util.*;
public class NonRepeatingCharacter {
    public static char check(String s){
            for (int i = 0; i < s.length(); i++) {
                boolean isUnique = true;
                for (int j = 0; j < s.length(); j++) {
                    if (i != j && s.charAt(i) == s.charAt(j)) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) {
                    return s.charAt(i);
                }
            }
            return '$';
    }
    public static void main(String as[]){
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=new String(ob.next());
        //int f=0;
        char ch=check(s);
        if(ch=='$'){
            System.out.println("The first non-repeating character is: "+(-1));
        }
        else{
            System.out.println("The first non-repeating character is: "+ch);
        }
    }
}


//Optimal Solution

//This solution uses a HashMap to keep track of the frequency of each character in the string. 
//It then iterates through the string once, and whenever it encounters a character with a frequency of 1, it prints that character and returns. 
//If no such character is found, it prints a message indicating no non-repeating character is found.

import java.util.*;
public class NonRepeatingChar {
    public static void check(String s){
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }
        for(char c : s.toCharArray()){
            if(freq.get(c)==1){
                System.out.println("The first non-repeating character is: "+c);
                //return c;
            }
        }
        System.out.println("No non-repeating character found");
        //return; //To handle case when no non-repeating character is found
    }
    public static void main(String as[]){
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=new String(ob.next());
        //int f=0;
        check(s);
    }
}
