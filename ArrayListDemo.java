import java.io.*;
import java.util.*;
public class ArrayListDemo {
    public static void main(String args[]) {
        Scanner Sc=new Scanner(System.in);
        ArrayList <Integer> Al=new ArrayList <Integer> ();
        int sum=0;
        float avg=0;
        System.out.println("Enter integer elements in to ArrayList");
        while(Sc.hasNextInt()) {
            Al.add(Sc.nextInt());
        }
        for(int i=0;i<Al.size();i++) {
            sum=sum+Al.get(i);
        }
        avg=sum/(float)Al.size();
        System.out.println("Sum of ArrayList elements is " +sum);
        System.out.println("Average of ArrayList elements is " +avg);
    }
}

