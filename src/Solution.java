public class Solution {

    static boolean palindrome(String s){
        s = s.toLowerCase();

        if(s.length() == 0 || s.length() == 1){
            return true;
        }

        if(s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }

        return palindrome(s.substring(1, s.length()-1));
    }

    public static void main(String[] args) {
        String s1 = "abcba";
        String s2 = "argentinamanitnegra";
        String s3 = "Sapalsarītadēdatīraslapas";
        String s4 = "abccb";
        String s5 = "stirna";

        System.out.println(palindrome(s1));
        System.out.println(palindrome(s2));
        System.out.println(palindrome(s3));
        System.out.println(palindrome(s4));
        System.out.println(palindrome(s5));
    }
}
