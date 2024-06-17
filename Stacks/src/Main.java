public class Main {
    public static void main(String[] args) {

        Stacks stacks = new Stacks(2);

        stacks.push(4);
        stacks.push(5);
//        stacks.pop();

        stacks.printStack();
        stacks.getHeight();
        stacks.getTop();

    }
}