public class Main {
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList(7);

        dll.append(2);
        dll.append(3);
        dll.prepend(1);
        dll.append(4);

        dll.removeFirst();

        dll.printList();
        dll.getHead();
        dll.getTail();
        dll.getLength();



    }
}