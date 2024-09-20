import java.io.*;
import java.util.*;
public class GCDRec {
    int GCD(int m,int n) {
        if(m>n) {
            return GCD(n,m);
        }
        if(m==n) {
            return m;
        }
        if(m==0) {
            return n;
        }
        if(m==1) {
            return 1;
        }
        return GCD(m,n%m);
    }
    public static void main(String args[]) {
        GCDRec Ob=new GCDRec();
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the GCD: ");
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        int G=Ob.GCD(a,b);
        System.out.println("GCD of given numbers is "+G);
    }
}
