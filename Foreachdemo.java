import java.io.*;
public class Foreachdemo {
    public static void main(String args[]) {
        int arr[] = {10,20,30,40,50};
        String[] StudentDetails = { "Sasi","Venkatasatya","CIC" };
        System.out.println("The elements in the array are");
        for(int i : arr) {
            System.out.println(i+" ");
        }
        System.out.println("Student Details are");
        for(String str:StudentDetails) {
            System.out.print(str+" ");
        }
    }
}
