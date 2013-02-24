/**
 * Created with IntelliJ IDEA.
 * User: Lukas
 * Date: 23.02.13
 * Time: 17:35
 * To change this template use File | Settings | File Templates.
 */
public class List {
    Node first;
    Node current;
    Node tail;
    Node save;

    public List(){
        tail = new Node(null);
        tail.setNext(tail);
        first = tail;
        current = tail;
    }

    public boolean isEmpty(){
        if(tail.getNext() == null){
            return true;
        }
        return false;
    }

    public boolean isBefore(){
        if(current.getNext()== first || current.getNext() == tail){
            return true;
        }
        return false;
    }

    public boolean isBehind(){
        if(current == tail || isEmpty()==true )
            return true;
        else
            return false;
    }

    public void next(){
        current = current.getNext();
    }

    public void previous(){
        save = current;
        current = first;
        while(current.getNext() != save){
            current = current.getNext();
        }
    }

    public void toFirst(){
        current = first;
    }

    public void toLast(){
        if(isEmpty()== true)
            current.setNext(tail);
        else
            current = tail.getNext();
    }

    public Object getItem(){
        if(isEmpty()== true)
        return null;
        else
        return current.getContent();
    }

    public void update(Object pObject){
        if(!isEmpty()&& current != tail)
            current.setContent(pObject);
    }

    public void insertBefore(Object pObject){
        if(current != tail){
            Node ee = new Node(pObject);
            previous();
            ee.setNext(current);
            current.setNext(ee);
        }
        else{
            Node ee = new Node(pObject);
            ee.setNext(tail);
            current = ee;
        }


    }

    public void insertBehind(Object pObject){
        if (current != tail){
            Node ee = new Node(pObject);
            ee.setNext(current.getNext());
            current.setNext(ee);
        }
        else{
            Node ee = new Node(pObject);
            ee.setNext(tail);
            current = ee;
        }
    }

    public void delete(){
        if(current.getNext()!= tail && current.getNext()!=first){
            previous();
            current.setNext(current.getNext().getNext());
        }

    }

}
