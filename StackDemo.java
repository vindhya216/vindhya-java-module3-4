
import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(10);  // Push 10
        s.push(20);  // Push 20
        s.pop();     // Remove top element (20)
        s.push(30);  // Push 30

        System.out.println("Top item is: " + s.peek());
    }
}
