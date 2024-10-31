package FirstJava;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the INR value to convert ");
        int inr=input.nextInt();
        float usd=(inr/83.4f);
        System.out.println("INR of "+inr+" is worth of "+usd+" dollars");
    }
}
