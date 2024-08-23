import java.io.*;
import java.util.Scanner;
public class Palindrome extends Object {
    public static void main(String args[]) {
        Scanner Sc=new Scanner(System.in);
        int x,r,s=0,temp;
        System.out.println("Enter a positive integer");
        x=Sc.nextInt();
        temp=x;
        while(x>0); {
            r=x%10;
            s=(s*10)+r;
            x=x/10;
        }
        if(temp==s) {
            System.out.println(temp+"is a palindrome");
        }
        else {
                System.out.println(temp+"is not a palindrome");
            }
    }
}
