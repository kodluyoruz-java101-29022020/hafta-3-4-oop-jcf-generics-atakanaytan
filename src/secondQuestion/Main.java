package secondQuestion;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<Integer>();

        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addLast(5);
        linkedList.addFirst(11);

        linkedList.iterateForward();
    }
}
