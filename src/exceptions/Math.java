package exceptions;

public class Math {
    public static void main(String[] args) {

        int a=5;
        try{
        System.out.println(a/0);
    } catch (Exception e){
            System.out.println("your code has issue");
        }

        }
}
