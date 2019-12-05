package exerSort;

public class MockLinkedList<T> {

    Node<T> head;
    Node<T> tail;
    private int size = 0;

    private class Node<T> {
        T data;
        Node<T> pre;
        Node<T> next;

        public Node(T data, Node<T> pre, Node<T> next) {
            this.data = data;
            this.pre = pre;
            this.next = next;
        }
    }

    public void add(T t) {
        Node lastTail = tail;
        Node newNode = new Node(t, lastTail, null);
        tail = newNode;
        if (lastTail == null) {
            head = newNode;
        } else {
            lastTail.next = newNode;
        }
        size ++;
    }

}
