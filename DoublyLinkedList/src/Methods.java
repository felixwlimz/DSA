public interface Methods {

    void append(int value);
    void prepend(int value);
    DoublyLinkedList.Node removeFirst();
    DoublyLinkedList.Node removeLast();
    void printList();
    void getHead();
    void getTail();
    void getLength();
    DoublyLinkedList.Node get(int index);
    boolean set(int value, int index);

    boolean insert(int value, int index);
    boolean remove(int index);



}
