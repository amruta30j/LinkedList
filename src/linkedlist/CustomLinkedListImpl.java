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

    //Returns the head elemet in the list
    @Override
    public T getHeadElementData() {

            if(head!=null){
                return head.getData();
            }

        return null;
    }

    @Override
    public Node<T> insertAsAHeadNode( T data) {
        if(head!=null){
            Node<T> temp = head;
            head = new Node<T>(data);
            head.setData(data);
            head.setNext(temp);
        } else {
            head = new Node<T>(data);
        }
        return head;
    }

    @Override
    public void removeNodeAtThisLocation(int location) {

        int i=1;
        Node temp = head;
        Node prev = null;
        //head condition
       while (temp!=null){
           if(location==1 && temp!=null){
                    head = temp.getNext();
                    break;
           }

           if(i==location  && temp!=null){
                prev.setNext(temp.getNext());
                break;
                }
                prev = temp;
                i++;
                temp = temp.getNext();
            }
            temp=null;

        }


    private int getLinkedListSize(){

        Node<T> temp = head;
        int i =0;
        while (temp!=null){
            temp = temp.getNext();
            i++;
        }
        return i;
    }

    @Override
    public void reverseList() {

       Node<T> prev = null;
       Node<T> curr = head;
       Node<T> next = null;

        if (head == null || head.getNext() == null) {
            return;
        }
           while (curr!=null){

               next = curr.getNext();
               curr.setNext(prev);
               prev =curr;
               curr=next;
           }
           head=prev;


    }

    public static void main(String args[]){

        CustomLinkedListImpl<Integer> customLinkedList = new CustomLinkedListImpl<>();

        customLinkedList.addNode(1);
        customLinkedList.addNode(2);
        customLinkedList.addNode(3);
        customLinkedList.addNode(4);
        //customLinkedList.printData();
        customLinkedList.insertAsAHeadNode(5);
        //customLinkedList.printData();

        //customLinkedList.removeNodeAtThisLocation(5);
        //System.out.println("After removing the node the list is");
        //customLinkedList.printData();
        customLinkedList.reverseList();
        customLinkedList.printData();

    }
}
