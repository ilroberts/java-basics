package chapter1;

public class UniqueChars {

    public static boolean hasUniqueChars(String str) {
   
        boolean[] checker = new boolean[26];    
        for(int i=0;i<str.length();i++) {
            int val = str.charAt(i) - 'a';
            if(checker[val]) {
                return false;
            }    
            checker[val] = true;
        }
        return true;
    }
}
