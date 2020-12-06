package LinkedList;

public class Node {

    private Node child;
    private int value;

    public Node(int value){
        Node child = null;
        this.value = value;
    }

    public void setChild(Node child){
        this.child = child;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public Node next(){
        return this.child;
    }

    public Node getChild(){
        return this.child;
    }

    public boolean hasNext(){
        if (this.child != null){
            return true;
        }else{
            return false;
        }
    }
}
