package main.general;

/**
 * to check if a number is palindrome or not
 */
public class IsPalindrome {
    public static void main(String[] args){
        int n1 = 313;
        int n2 = reverse(n1);
        if(n1 == n2){
            System.out.print("Yes palindrome");
        }else{
            System.out.print("Not palindrome");
        }
    }

    private static int reverse(int number) {
        int reverse = 0;

        while(number != 0){
            reverse = reverse*10 + number%10;
            number = number/10;
        }

        return reverse;
    }
}
