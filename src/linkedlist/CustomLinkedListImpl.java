package linkedlist;

/**
 * Created by amrutaj on 19/06/2018.
 */
public class CustomLinkedListImpl<T extends Comparable<T>> implements CustomLinkedList<T>{

    private Node<T> head = null;

    @Override
    public void addNode(T data) {

        if(head==null){
            head = new Node<T>(data);
        } else {
            Node<T> temp = head;
            while (temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(new Node<T>(data));
        }
    }

    @Override
    public void printData() {

        if(head==null){
            System.out.println("Linked list is empty");
        } else{
            Node<T> temp = head;
            int nodeNum =1;
            while(temp!=null){
                System.out.println("Node<T> number " +nodeNum + ", the value it stores is "+temp.toString());
                temp = temp.getNext();
                nodeNum++;
            }
        }

    }

    public static void main(String args[]){

        CustomLinkedListImpl<Integer> customLinkedList = new CustomLinkedListImpl<>();

        customLinkedList.addNode(1);
        customLinkedList.addNode(2);
        customLinkedList.addNode(3);
        customLinkedList.addNode(4);
        customLinkedList.printData();



    }
}
