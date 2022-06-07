package stackandqueue;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your stack size: ");
        int stackSize = scan.nextInt();
        System.out.println(stackSize);
        Stack<String> stack = new Stack<>(stackSize);
        System.out.println("Enter your inputs...");
        scan.nextLine();
        for (int i = 0; i < stackSize; i++) {
            String val = scan.nextLine();
            stack.push(val);
            System.out.println(i);
        }
        System.out.println("Removing all the elements of stack...\n");
        for (int i = 0; i < stackSize; i++) {
            stack.pop();
        }
        System.out.println("The Top Element Is " + stack.peek());
        System.out.println("The Stack Size Right Now Is " + stack.size());


        System.out.println("Enter your Queue size: ");
        int queueSize = scan.nextInt();
        System.out.println(queueSize);
        Queue<String> queue = new Queue<>(queueSize);
        System.out.println("Enter your inputs...");
        scan.nextLine();
        for (int i = 0; i < queueSize; i++) {
            String val = scan.nextLine();
            queue.enqueue(val);
            System.out.println(i);
        }
        System.out.println("Removing all the elements of queue...\n");
        for (int i = 0; i < queueSize; i++) {
            queue.dequeue();
        }
        System.out.println("The Peek Element Is " + queue.peek());
        System.out.println("The Queue Size Right Now Is " + queue.size());

    }
}
