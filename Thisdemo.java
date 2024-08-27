import java.io.*;
public class Thisdemo {
    private int a;
    public void setNumber(int a) {
    this.a=a;
    System.out.println("Value of a is "+a);
}
public static void main(String args[]) {
    Thisdemo td=new Thisdemo();
    td.setNumber(50);
}
}
