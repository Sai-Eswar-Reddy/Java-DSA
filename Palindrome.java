import java.util.*;
class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Palindrome sol = new Palindrome();
        boolean isPal = sol.isPalindrome(x);
        if(isPal){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int original = x;
        int rev = 0;
        while(x!=0){
            int n = x%10;
            rev = rev*10 + n;
            x = x/10;
        }
        return original == rev;
    }
}