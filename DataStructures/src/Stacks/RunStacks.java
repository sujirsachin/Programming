package Stacks;

public class RunStacks {
    public static void main(String args[])
    {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(3);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
