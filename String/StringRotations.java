public static boolean areRotations(String s1, String s2) {
        // Your code here
        if(s1.length() != s2.length()){
            return false;
        }
        
        String concat = s1 + s1;
        return concat.lastIndexOf(s2) >= 0;
    }