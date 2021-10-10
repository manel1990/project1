package singlleton;

public class Singleton {
    private static Singleton singleton=new Singleton();
    //we creat a single object

     private Singleton(){

    }
    public static Singleton getInstance(){
         return singleton;
    }
    public void doWork() {
        System.out.println("do my work");

    }
}