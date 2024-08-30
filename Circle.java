import java.io.*;
import java.util.*;
class Circle {
    double r;
    double area() {
        return(22/7.0)*r*r;
    }
}
    public class Main {
        public static void main(String args[]) {
            Circle C=new Circle();
            C.r=5.5;
            System.out.println("Area of circle with radius" +C.r+ " is : " +C.area());
    }
}
