package pattern;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a value from 1 to 100= ");
        int val=input.nextInt();
        printTree(val);
    }

    private static void printTree(int val) {
        if(val<2)
            System.out.println("You cannot generate christmas tree");
        else if(val>20)
            System.out.println("Tree is no more");
        else {

            //head
            int temp = 0;
            String str = "";
            while (temp++ < val)
                str += " ";
            System.out.println(str + "*");

            //body
            int spaceConst = val;
            while (val >= 2) {
                for (int i = 0; i < val; i++) {
                    int space = spaceConst - i - 1;
                    for (int s = 0; s < space; s++)
                        System.out.print(" ");
                    for (int j = 0; j < 3 + (2 * i); j++)
                        System.out.print("*");
                    System.out.println();
                }
                val--;
            }

            //stand
            System.out.println(str + "*");
            System.out.println(str + "*");
        }
    }
}
