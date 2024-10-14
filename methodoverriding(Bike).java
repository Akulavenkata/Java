import java.io.*;
class Bike {
    void run() {
        System.out.println("Bike is running");
    }
}
public class Honda extends Bike {
    void run() {
        System.out.println("Honda Bike is running");
    }
    public static void main(String args[]) {
        Honda H=new Honda();
        H.run();
        Bike B1=new Bike();
        B1.run();
        Bike B2=new Honda();
        B2.run();
    }
}
