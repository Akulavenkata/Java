import java.io.*;
import java.util.Scanner;
public class SwitchDemo {
    public static void main(String args[]) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number from 0 to 5");
        int num=Sc.nextInt();
        switch(num) {
        case 0:
        System.out.println("You entered Zero");
        break;
        case 1:
        System.out.println("You entered One");
        break;
        case 2:
        System.out.println("You entered Two");
        break;
        case 3:
        System.out.println("You entered Three");
        break;
        case 4:
        System.out.println("You entered Four");
        break;
        case 5:
        System.out.println("You entered Five");
        break;
        default:
        System.out.println("You entered an invalid number");
        }
    }
}
