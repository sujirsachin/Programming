package Queue;

public class RunQueue {
    public static void main(String args[])
    {
        Queue q = new Queue();
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        q.enqueue(3);
        q.enqueue(3);
        q.enqueue(3);
        q.enqueue(3);
        q.dequeue();
        //System.out.println(q.isFull());
        //System.out.println(q);

        QueueWithTwoStacks q2 = new QueueWithTwoStacks();
        q2.enqueue(1);
        q2.enqueue(3);
        q2.enqueue(4);
        System.out.println(q2.dequeue());
        System.out.println(q2.dequeue());
        q2.enqueue(5);
        q2.enqueue(7);
        System.out.println(q2.dequeue());
        System.out.println(q2.dequeue());
        System.out.println(q2.peek());
    }
}
