
public class LinkedLists {



    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public LinkedLists(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;

    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if(length == 0){
            return null;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
            length--;
            if(length == 0){
                tail = null;
            }
            return temp;

        }
    }

    public Node removeLast(){
        if(length == 0){
            return null;
        } else {
            Node temp = head;
            Node pre = head;
            while (temp.next != null){
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            length--;
            if(length == 0){
                head = null;
                tail = null;
            }
            return temp;
        }
    }

    public Node remove(int index){
        if(index < 0 || index >= length){
            return null;
        }
        if(index == 0){
            return removeFirst();
        }
        if(index == length - 1){
            return removeLast();
        }
        Node pre = get(index - 1);
        Node temp = pre.next;
        pre.next = temp.next;
        temp.next = null;
        length--;
        return temp;

    }


    public boolean insert(int index, int value){
        if(index < 0 || index > length){
            return false;
        }
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;

    }

    public void print(){
        Node currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i = 0; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;

        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }


    public Node get(int index){
        if(index < 0 || index >= length){
            System.out.println("Index out of range");
            return null;
        } else {
            Node temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            return temp;

        }
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;

        }
        return false;

    }




}
