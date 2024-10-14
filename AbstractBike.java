import java.io.*;
import java.util.*;
abstract class Bike {
    abstract void run();
}
public class Honda extends Bike {
    void run() {
        System.out.println("Honda Bike is running");
    }
    public static void main(String args[]) {
        Bike Ob=new Honda();
        Ob.run();
    }
}
