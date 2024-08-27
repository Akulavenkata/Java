import java.io.*;
import java.util.Scanner;
public class StudentAverage {
    public static void main(String args[]) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter marks of five subjets");
        int s1=Sc.nextInt();
        int s2=Sc.nextInt();
        int s3=Sc.nextInt();
        int s4=Sc.nextInt();
        int s5=Sc.nextInt();
        float avg=(s1+s2+s3+s4+s5) / 5;
        System.out.println("Average of the student is "+avg);
        if(avg>=80) {
            System.out.println("Student passed with distriction");
        }
        else if(avg>=70 && avg<80) {
            System.out.println("Student passed with first class");
        }
        else if(avg>=50 && avg<70) {
            System.out.println("Student passed in second class");
        }
        else if(avg>=40 && avg<50) {
            System.out.println("Student passed in third class");
        }
        else {
            System.out.println("Student failed");
        }
    }
}
