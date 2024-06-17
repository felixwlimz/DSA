public class Main {
    public static void main(String[] args) {

        Queues queues = new Queues(2);

        queues.enqueue(3);
        queues.enqueue(4);
        queues.dequeue();


        queues.printQueue();

    }
}