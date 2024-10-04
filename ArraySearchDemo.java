import java.io.*;
import java.util.*;
public class ArraySearchDemo {
    public static void main(String args[]) {
        Scanner Sc=new Scanner(System.in);
        int pos=-1;
        System.out.println("Enter no. of elements of array: ");
        int n=Sc.nextInt();
        int arr[]=new int[n];
        System.out.println(" Enter " +n+ " values ");
        for(int i=0;i<n;i++) {
            arr[i]=Sc.nextInt();
        }
        System.out.println("Enter the key elements to be search: ");
        int Key=Sc.nextInt();
        for(int i=0;i<n;i++) {
            if(arr[i]==Key) {
                pos=i+1;
                break;
            }
        }
        if(pos==-1) {
            System.out.println(Key+ " Element not found ");
        }
            else
            {
                System.out.println(Key+ " Element found at " +pos);
            }
    }
}
