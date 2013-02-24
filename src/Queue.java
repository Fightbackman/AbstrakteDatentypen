/**
 * Created with IntelliJ IDEA.
 * User: Lukas
 * Date: 24.02.13
 * Time: 15:16
 * To change this template use File | Settings | File Templates.
 */
public class Queue {
    Node last;
    Node first;

    public Queue(){

    }

    public boolean isEmpty(){
        return first==null;
    }

    public void enqueue(Object pObject){
        Node ee = new Node(pObject);
        if(isEmpty())
            first = ee;
        else
            last.setNext(ee);
            last = ee;
    }

    public void dequeue(){
        if(!isEmpty())
            first = first.getNext();
    }

    public Object front(){
        if(!isEmpty())
            return first.getContent();
        else
            return null;
    }
}
