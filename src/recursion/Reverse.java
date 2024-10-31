package recursion;


public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(1234));

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
