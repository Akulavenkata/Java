import java.io.*;
import java.util.*;
public class FibRec {
    int Fib(int x) {
        if(x==0) {
            return 0;
        }
        else if(x==1) {
            return 1;
        }
        else {
            return(Fib(x-1)+Fib(x-2));
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        FibRec Ob=new FibRec();
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println("The fibanocci series is");
        for(int i=0;i<n;i++) {
            System.out.println(Ob.Fib(i));
        }
    }
}
