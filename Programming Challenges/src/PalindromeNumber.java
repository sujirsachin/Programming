public class PalindromeNumber {

//https://leetcode.com/problems/palindrome-number
    public static boolean isPalindrome(int x) {
        StringBuilder number = new StringBuilder();
        number.append(String.valueOf(x));
        number = number.reverse();
        return (String.valueOf(x)).equals(String.valueOf(number));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
