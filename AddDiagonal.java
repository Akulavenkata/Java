import java.io.*;
import java.util.*;
public class AddDiagonal {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of rows and columns : ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        if(r!=c) {
            System.out.println("Addition of Diagonal elements is not possible ");
            System.out.println(0);
        }
        else {
            int arr[][]=new int[r][c];
            System.out.println(" Enter " +(r*c)+ " elements in the array ");
            for(int i=0;i<r;i++) {
                for(int j=0;j<c;j++) {
                    arr[i][j]=sc.nextInt();
                }
            }
            int sum=0;
            for(int i=0;i<r;i++) {
                for(int j=0;j<c;j++) {
                    if(i==j) {
                        sum=sum+arr[i][j];
                    }
                }
            }
            System.out.println("The elements of the matrix are ");
            for(int i=0;i<r;i++) {
                for(int j=0;j<c;j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println("Sum of principle diagonal elements is "+sum);
            }
        }
    }
}
