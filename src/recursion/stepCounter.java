package recursion;

public class stepCounter {
    public static void main(String[] args) {
        System.out.println(counter(12));
    }

    private static int counter(int n) {
        return helper(n,0);
    }

    private static int helper(int n, int c) {
        if(n==1)
            return c;
        if(n%2==1)
            return helper(n-1,c+1);

        return helper(n/2,c+1);
    }
}
