import java.io.*;
public class StaticBlockDemo {
    public static void main(String args[]) {
        System.out.println("Inside main method");
    }
    static {
        System.out.println("This is static block");
    }
}
