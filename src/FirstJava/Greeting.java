package FirstJava;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter our name: ");
        String val=input.next();
        System.out.println("Welcome "+val);
    }
}
