public class Main {
    public static void main(String[] args) {

        LinkedLists linkedLists = new LinkedLists(4);
        linkedLists.makeEmpty();
        linkedLists.append(3);
        linkedLists.append(2);
        linkedLists.append(1);

        linkedLists.set(1,5);


        linkedLists.reverse();


        linkedLists.print();
        linkedLists.getHead();
        linkedLists.getTail();
        linkedLists.getLength();

    }
}