import java.io.*;
import java.util.*;
class Circle {
    double r;
    double area() {
        return(22/7.0)*r*r;
    }
    void setCircle(double C) {
        r=C;
    }
}
    public class Main {
        public static void main(String args[]) {
            Scanner Sc=new Scanner(System.in);
            System.out.println("Enter radius of the first circle");
            double radius1=Sc.nextDouble();
            Circle c1=new Circle();
            c1.setCircle(radius1);
            System.out.println("Enter radius of the second circle");
            double radius2=Sc.nextDouble();
            Circle c2=new Circle();
            c2.setCircle(radius2);
            System.out.println("Area of first circle is "+c1.area());
            System.out.println("Area of second circle is "+c2.area());
            
    }
}
