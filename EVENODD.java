import java.io.*;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer to check it is even or odd");
        int num=sc.nextInt();
        if(num%2==0) {
            System.out.println(num+" is an even integer ");
        }
        else {
            System.out.println(num+" is an odd integer ");
        }
    }
}
