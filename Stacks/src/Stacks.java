public class Stacks {

    class Node {
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node top;
    private int height;

    public Stacks(int value){
        top = new Node(value);
        height = 1;
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(height == 0){
            top = null;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public void pop(){
        Node temp = top;
        if(height == 0){
            return;
        }
        top = top.next;
        temp.next = null;
        height--;
    }


    public void printStack(){
        Node temp = top;

        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHeight(){
        System.out.println("Height : " + height);
    }

    public void getTop(){
        System.out.println("Top : " + top.value);
    }




}
