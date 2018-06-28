package linkedlist;

/**
 * Created by amrutaj on 19/06/2018.
 */
public interface CustomLinkedList<T extends Comparable<T>> {

    void addNode(T data);

    void printData();

    T getHeadElementData();

    Node<T> insertAsAHeadNode(T data);

    void removeNodeAtThisLocation(int location);

    void reverseList();



}

