import java.io.*;
public class FormatedOutputDemo1 {
    public static void main(String args[]) {
        String str="Venkata Satya";
        System.out.printf("\n The string value is : %s\n",str);
        int x=512;
        System.out.printf("\n The int value is : %d\n",x);
        double f=5.24678;
        System.out.printf("\n The double value is : %f\n",f);
        System.out.printf("After formating to specific width the value is : %.4f\n",f);
        System.out.printf("After formating to right margin the value is : %10.2f\n",f);
    }
}
