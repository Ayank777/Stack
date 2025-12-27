import java.util.Scanner;

public class Stack {
    static final int maxsize = 5;
    static int[] stack = new int[maxsize];
    static int index1 = -1;

    public static void push() {
        Scanner scanner = new Scanner(System.in);

        if (index1 == maxsize - 1) {
            System.out.println("Stack Overflow");
        } else {
            System.out.print("Enter element for stack: ");
            int element = scanner.nextInt();
            index1++;
            stack[index1] = element;
            System.out.println("Element pushed.");
        }
    }

    public static void pop() {
        if (index1 == -1) {
            System.out.println("Stack is Empty");
        } else {
            int n = stack[index1];
            index1--;
            System.out.println("Popped element = " + n);
        }
    }

    public static void printstack() {
        if (index1 == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Elements of stack:");
            for (int i = index1; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        push();
        push();
        printstack();
        pop();
        printstack();
    }
}
