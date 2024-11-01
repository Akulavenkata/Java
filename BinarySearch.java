import java.io.*;
import java.util.*;

public class BinarySearchDemo {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int pos = -1, low = 0, high = 0;

        System.out.println("Enter no. of elements of array :  ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println(" Enter " +n+ " values in sorted order : ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key elements to be search:  ");
        int key=sc.nextInt();
        low = 0;
        high = n - 1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid] == key) {
                pos=mid+1;
                break;
            }
            else if(arr[mid] > key) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        if(pos == -1) {
            System.out.println("Search unsuccessful");
        }else {
            System.out.println("Element found at" +pos);
        }
    }
}

