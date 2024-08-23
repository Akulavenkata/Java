import java.io.*;
public class HelloWorld extends Object {
    private String greetings = "HelloWorld";
    public void greet() {
        System.out.println(greetings);
    }
    public static void main(String args[]) throws IOException
    {
        HelloWorld Hw=new HelloWorld();
        Hw.greet();
    }
}
