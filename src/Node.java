/**
 * Created with IntelliJ IDEA.
 * User: Lukas
 * Date: 24.02.13
 * Time: 13:27
 * To change this template use File | Settings | File Templates.
 */
public class Node {
    Object contentObj;
    Node nextNode;

    public Node (Object pContent){
        contentObj = pContent;
        nextNode = null;
    }

    public void setContent(Object pObject){
        contentObj = pObject;
    }

    public Object getContent(){
        return contentObj;
    }

    public void setNext(Node pNext){
        nextNode = pNext;
    }

    public Node getNext(){
        return nextNode;
    }
}
