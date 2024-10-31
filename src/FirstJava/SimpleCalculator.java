package FirstJava;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two numbers and the operator(+,-,*,/,%): ");
        int num1=input.nextInt();
        int num2=input.nextInt();
        String operand=input.next();
        float res = 0;

        if(operand.equals("+"))
            res=num1+num2;
        if(operand.equals("-"))
            res=num1-num2;
        if(operand.equals("*"))
            res=num1*num2;
        if(operand.equals("/"))
            res=num1/num2;
        if(operand.equals("%"))
            res=num1%num2;

        System.out.println("the output is: "+res);

    }
}
