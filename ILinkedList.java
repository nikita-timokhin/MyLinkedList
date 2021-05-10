import java.util.Iterator;

public interface ILinkedList<E> extends Iterator {


    void add(E element);

    void add(int index, E element);

    void clear();

    E get(int index);

    int indexOf(E element);

    E remove(int index);

    E set(int index, E element);

    int size();

    E[] toArray();

    String toString();
}
