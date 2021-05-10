import java.util.*;

public class MyLinkedList<E> implements ILinkedList<E> {

    private int size = 0;
    private Node<E> first;
    private Node<E> last;
    private Node<E> current;
    private int currentIndex;

    @Override
    public void add(E element) {
        Node<E> node = new Node(element);
        if (first == null) {
            first = node;
            current = node;
        }
        if (last != null) {
            last.setNextNode(node);
            last = node;
        } else {
            last = first;
        }
        size++;
    }

    @Override
    public void add(int index, E element) {
        if (index > size) throw new IndexOutOfBoundsException();
        int curIndex = 0;
        Node<E> cur = first;
        while (curIndex < index) {
            cur = cur.getNextNode();
            curIndex++;
        }
        Node<E> temp = cur.getNextNode();
        Node<E> newNode = new Node<>(element);
        cur.setNextNode(newNode);
        newNode.setNextNode(temp);
    }

    @Override
    public void clear() {
        for (Node<E> cur = first; cur != null; ) {
            Node<E> next = cur.getNextNode();
            cur.setElement(null);
            cur.setNextNode(null);
            cur = next;
        }
        first = last = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        if (index > size) throw new IndexOutOfBoundsException();
        int curIndex = 0;
        Node<E> cur = first;
        while (curIndex < index) {
            cur = cur.getNextNode();
            curIndex++;
        }
        return cur.getElement();

    }

    @Override
    public int indexOf(E element) {
        int index = 0;
        if (element == null) {
            for (Node<E> cur = first; cur != null; cur = cur.getNextNode()) {
                if (cur.getElement() == null)
                    return index;
                index++;
            }
        } else {
            for (Node<E> cur = first; cur != null; cur = cur.getNextNode()) {
                if (element.equals(cur.getElement()))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        if (index > size) throw new IndexOutOfBoundsException();
        int curIndex = 0;
        Node<E> cur = first;
        if (first.getNextNode() == null) {
            E res = cur.getElement();
            clear();
            return res;
        }
        Node<E> previous = first;
        while (curIndex < index) {
            previous = cur;
            cur = cur.getNextNode();
            curIndex++;
        }
        E res = cur.getElement();
        previous.setNextNode(cur.getNextNode());
        cur.setElement(null);
        cur.setNextNode(null);
        size--;
        return res;
    }

    @Override
    public E set(int index, E element) {
        if (index > size) throw new IndexOutOfBoundsException();
        int curIndex = 0;
        Node<E> cur = first;
        while (curIndex < index) {
            cur = cur.getNextNode();
            curIndex++;
        }
        E res = cur.getElement();
        cur.setElement(element);
        return res;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E[] toArray() {
        E[] res = (E[]) new Object[size];
        int i = 0;
        for (Node<E> cur = first; cur != null; cur = cur.getNextNode())
            res[i++] = cur.getElement();
        return res;
    }


    @Override
    public boolean hasNext() {
        return currentIndex + 1 > size;
    }

    @Override
    public E next() {
        if (!hasNext()) throw new NoSuchElementException();
        E res = current.getElement();
        current = current.getNextNode();
        return res;
    }

    public void resetIterator() {
        current = first;
        currentIndex = 0;
    }

    @Override
    public String toString() {
        String res = "";
        Node<E> cur = new Node<>();
        cur = first;
        while (cur != null) {
            res += cur.getElement().toString() + " ";
        }

        return res;
    }
}
