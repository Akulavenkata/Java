import java.io.*;
import java.util.*;
public class MatrixAddition {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of rows and columns in matrix A : ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.println("Enter the elements of rows and columns in matrix B : ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        if(r1!=r2 || c1!=c2) {
            System.out.println("Addition is not possible ");
            System.exit(0);
        }
        else {
            int a[][]=new int[r1][c1];
            int b[][]=new int[r2][c2];
            int c[][]=new int[r1][c1];
            System.out.println(" Enter " +(r1*c1)+ " in to matrix A ");
            for(int i=0;i<r1;i++) {
                for(int j=0;j<c1;j++) {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println(" Enter " +(r2*c2)+ " in to matrix B ");
            for(int i=0;i<r2;i++) {
                for(int j=0;j<c2;j++) {
                b[i][j]=sc.nextInt();    
                }
            }
            for(int i=0;i<r1;i++) {
                for(int j=0;j<c1;j++) {
                    c[i][j]=a[i][j]+b[i][j];
                    }
                }
            }
            int c[][]=new int[r1][c1];
            System.out.println("After addition the resultant matrix C is : ");
            for(int i=0;i<r1;i++) {
                for(int j=0;j<c1;j++) {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println(" ");
            }
        }
}
        
