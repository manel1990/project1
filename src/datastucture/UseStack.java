package datastucture;

import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {


        Stack<String> list = new Stack<>();
        list.push("a");
        list.push("b");
        list.push("c");
        System.out.println(list.pop());
    }
}