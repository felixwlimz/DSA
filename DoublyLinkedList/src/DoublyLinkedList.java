public class DoublyLinkedList implements Methods {

    public class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }


    private Node head;
    private Node tail;
    int length;

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    @Override
    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        length++;

    }

    @Override
    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
            head.prev = null;
        }
      length++;
    }

    @Override
    public Node removeFirst() {
        if(length == 0){
            return null;
        }
        Node temp = head;
        if(length == 1) {
            head = null;
            tail = null;
            return null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;

        }
        length--;
        return temp;

    }

    @Override
    public Node removeLast() {
        if(length == 0){
            System.out.println("Linked List is Empty! ");
            return null;
        }
        Node temp = tail;
        if(length == 1){
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;

    }

    @Override
    public void printList() {
        Node currentNode = head;
        while (currentNode != null){
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }

    }

    @Override
    public void getHead() {
        System.out.println("Head : " + head.value);
    }

    @Override
    public void getTail() {
        System.out.println("Tail : " + tail.value);
    }

    @Override
    public void getLength() {
        System.out.println("Length : " + length);


    }

    @Override
    public Node get(int index) {
        if(index == 0 || index >= length){
            return null;
        }
        Node temp = head;
        if(index < length / 2){
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
        } else {
            temp = tail;
            for(int i = length - 1 ; i > index ; i--){
                temp = temp.prev;
            }
        }
        return temp;

    }

    @Override
    public boolean set(int value, int index) {
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;


    }

    @Override
    public boolean insert(int value, int index) {
        if(index < 0 || index > length){
            return false;
        }
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length ){
            append(value);
            return true;
        }

        Node before = get(index - 1);
        Node after = before.next;
        Node newNode = new Node(value);

        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;

    }

    @Override
    public boolean remove(int index) {
        if(index < 0 || index > length){
            return false;
        }
        if(index == 0){
            removeFirst();
            return true;
        }
        if(index == length - 1){
            removeLast();
            return true;
        }
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.prev = null;
        temp.next = null;
        length--;
        return false;
    }
}
