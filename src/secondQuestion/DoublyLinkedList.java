package secondQuestion;

import java.util.NoSuchElementException;

public class DoublyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;


    public DoublyLinkedList(int size) {
        size = 0;
    }

    public DoublyLinkedList() {

    }

    public int size() {

        return size;
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public void addFirst(T element) {
        Node<T> tmp = new Node<>(element, head, null);

        if (head != null ) {
            head.previous = tmp;
        }

        head = tmp;

        if(tail == null) {
            tail = tmp;
        }

        size++;
        System.out.println("adding: "+element);
    }

    public void addLast(T element) {

        Node<T> tmp = new Node<>(element, null, tail);

        if (tail != null) {
            tail.next = tmp;
        }

        tail = tmp;

        if(head == null) {
            head = tmp;
        }

        size++;
        System.out.println("adding: "+element);
    }

    public void iterateForward() {

        System.out.println("İterating forward");
        Node<T> temp = head;

        while (temp != null) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }

    public void iterateBackward() {

        System.out.println("İterating backward");

        Node<T> temp = tail;

        while (temp != null) {

            System.out.print(temp.data+ " ");
            temp = temp.previous;
        }
    }


    public T removeFirst() {

        if (size == 0) {

            throw new NoSuchElementException();
        }

        Node<T> temp = head;
        head = head.next;
        head.previous = null;
        size--;

        System.out.println("Deleted node is: "+temp.data);

        return temp.data;
    }

    public T removeLast() {

        if (size == 0) {

            throw new NoSuchElementException();
        }

        Node<T> temp = tail;
        tail = tail.previous;
        tail.next= null;

        size--;
        System.out.println("Deleted node is: "+temp.data);

        return temp.data;
    }

}


