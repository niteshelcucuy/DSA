package FirstJava;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int a=0;
        int b=1;

        System.out.println("Enter the nth value ");
        int n=input.nextInt();

        if(n==1)
            System.out.println(a);
        if(n==2) {
            System.out.println(a);
            System.out.println(b);
        }
        if(n>2){
            System.out.println(a);
            System.out.println(b);
            int count=2;

            while(count<=n) {
                int temp = b;
                b = a + b;
                a = temp;
                System.out.println(b);
            }

        }

    }
}
