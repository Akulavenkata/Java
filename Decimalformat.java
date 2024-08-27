import java.io.*;
import java.text.DecimalFormat;
public class FormatedOutputDemo2 {
    public static void main(String args[]) {
        double x=123.4567;
        System.out.printf("\n The number is : %f\n",x);
        DecimalFormat df=new DecimalFormat("####");
        System.out.println("Without fractional part the number is :"+df.format(x));
        df=new DecimalFormat("###");
        System.out.println("Formated number with precision is :"+df.format(x));
    }
}
