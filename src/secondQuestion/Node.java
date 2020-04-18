package secondQuestion;

public class Node<T> {

    Node<T> next;
    Node<T> previous;
    T data;

    public Node(T data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }


}
