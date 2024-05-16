public class PalindromeNumberEasy {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(325));
        System.out.println(isPalindrome(5458145));
        System.out.println(isPalindrome(12321));
    }
    public static boolean isPalindrome(int x) {
        String n = Integer.toString(x);
        for(int i = 0; i < n.length()/2; i++)
            if (n.charAt(i) != n.charAt(n.length() - i - 1)){
                return false;
            }
        return true;
    }
}
