import java.io.*;
abstract class Base{
    Base(){
        System.out.println("Base constructor is invoked");
    }
    abstract void fun();
}
class Derived extends Base{
    Derived(){
        super();
        System.out.println("Derived constructor is invoked");
    }
        void fun(){
            System.out.println("Derived function is invoked");
        }
}
   public  class AbstractDemo{
        public static void main(String args[]){
            Derived d=new Derived();
            d.fun();
        }
    }
