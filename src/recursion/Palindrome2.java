package recursion;


public class Palindrome2 {
    public static void main(String[] args) {
        int num=123210;

        if(num==reverse(num))
            System.out.println(true);
        else
            System.out.println(false);

    }

    static int reverse(int n){
        int digit=(int)Math.log10(n)+1;
        System.out.println(digit);
        return helper(n,digit);
    }

    private static int helper(int n, int digit) {
        if(digit==0)
            return 0;
        return (int) ((n%10*Math.pow(10,digit-1)) + helper(n/10,digit-1));
    }
}
