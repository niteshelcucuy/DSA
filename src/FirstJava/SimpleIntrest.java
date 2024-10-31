package FirstJava;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the principal, number of years, rate of intrest: ");
        float P=input.nextInt();
        float n=input.nextFloat();
        float r=input.nextFloat();

        float SI=(P*n*r)/100;

        System.out.println("Earned intrest is "+SI);

    }
}
