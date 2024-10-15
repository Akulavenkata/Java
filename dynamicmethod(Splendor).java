import java.io.*;
import java.util.*;
class Bike{
    void run(){
    System.out.println("Bike is running");
    }
}
public class Splendor extends Bike {
    void run(){
        System.out.println("Splendor Bike is running with 60KMPH");
    }
    public static void main(String args[]){
        Splendor s=new Splendor();
        s.run();
        Bike B1=new Bike();
        B1.run();
        Bike B2=new Splendor();
        B2.run();
    }
}
