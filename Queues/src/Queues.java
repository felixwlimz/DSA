public class Queues {

    class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int length;


    Queues(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void enqueue(int value){
        Node newNode = new Node(value);
        if(length == 0){
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public void dequeue(){
        if(length == 0){
            return;
        }
        Node temp = first;
        if(length == 1){
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        length--;
    }

    public void printQueue(){
        Node temp = first;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }


}
