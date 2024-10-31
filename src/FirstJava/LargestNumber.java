package FirstJava;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the 2 numbers: ");
        int num1=input.nextInt();
        int num2=input.nextInt();

        int res=num1>num2?num1:num2;

        System.out.println("The largest number is "+res);
    }
}
