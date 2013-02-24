/**
 * Created with IntelliJ IDEA.
 * User: Lukas
 * Date: 23.02.13
 * Time: 17:22
 * To change this template use File | Settings | File Templates.
 */

///es folgt eine Implemtierung des Stack mit Hilfe eines Integerarrays
/**
public class Stack {
    private int[] liste;
    private int pos;

    public Stack(){
        liste = new int[10];
        pos = 0;
    }

    public boolean empty(){
        return pos ==0;
    }

    public int top(){
        if(!empty())
            return liste[pos-1];
        else
            return -1;
        //throw new RuntimeException("Stack ist leer");
    }

    public void push(int elem){
        if(pos <10)
            pos++;
        liste[pos-1]=elem;
    }

    public void pop(){
        if(!empty())
            liste[pos-1]=0;
            pos--;
    }
}

*/

/// Implementierung des Stack mit Hilfe der Node-Class

public class Stack{
    Node first = null;

    public Stack(){
    }

    public boolean isEmpty(){
        if(first == null)
            return true;
        else
            return false;
    }

    public void push(Object pObject){
        Node ee = new Node(pObject);
        ee.setNext(first);
        first = ee;
    }

    public void pop(){
        first = first.getNext();
    }

    public Object top(){
        if(!isEmpty())
            return first.getContent();
        else
            return null;
    }
}
