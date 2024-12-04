import java.util.*;
public class Atoi {
    public static int myAtoi(String s) {
                // Your code here
                int i=0;
                int sign=1;
                while(i<s.length() && (s.charAt(i)==' ' || s.charAt(i)=='0'))
                    i++;
                while(i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-')){
                    if(s.charAt(i)=='-')
                        sign=-1;
                    ++i;
                }
                long res=0;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    res=res*10+s.charAt(i)-'0';
                    i++;
                }
                if(res*sign>Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                if(res*sign<Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
                return (int)res*sign;
            }
        public static void main(String as[]){
            Scanner ob=new Scanner(System.in);
            System.out.print("Enter a string: ");
            String s=ob.next();
            int res=myAtoi(s);
            System.out.println("Integer value: "+res);
    }
}
