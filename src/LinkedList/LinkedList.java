package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;

    public LinkedList(){
        Node head;
        Node tail;
    }


    //Add a value to the list
    public void add(int val){
        Node node = new Node(val);

        if (this.head == null){
            this.head = node;
        }else{
            tail.setChild(node);

        }
        this.tail = node;
    }

    //Add mutliple values to the linked list
    public void add(int[] val){

        for (int i : val){
            Node node = new Node(val[i-1]);

            if (this.head == null){
                this.head = node;
                tail = node;
            }else{
                tail.setChild(node);
                tail = node;

            }
        }

    }


    //prints list
    public void print(){
        System.out.println(this.toString());
    }


    //toString function of linked list
    @Override
    public String toString(){
        boolean hasNext;
        if (head != null){
            hasNext = true;
        }else{
            return "Empty Linked list";
        }

        String result = "";
        Node node = head;

        while (hasNext){
            if (node != head)
                result += (", ");
            result += node.getValue();

            if (node.next() != null){
                node = node.next();
            }else{
                hasNext = false;
                return result.toString();
            }
        }
        return result;
    }


    //Returns boolean if linked list contains value
    public boolean contains(int val){
        boolean hasNext = true;

        String result = "";
        Node node;
        try{
            node = head;
        }catch (NullPointerException e){
            return false;
        }


        while (hasNext){
            if (node.getValue() == val){
                return true;
            }else{
                if (node.next() != null){
                    node = node.next();
                }else{
                    return false;
                }
            }
        }
        return false;
    }


    //Reverse the linked list
    public void reverse(){

        Node next = null;
        Node current = head;
        Node prev = null;
        current = head;

        while(current != null){
            next = current.getChild();
            current.setChild(prev);
            prev = current;
            current = next;
            head = prev;
        }

    }

    //returns true if removed, false if error
    public boolean remove(int val){
        Node node = head;
        Node grandChild;
        if (node.getValue() == val){
            head = node.getChild();
            return true;
        }else{
            while (node.hasNext()){
                if (node.getChild().getValue() == val){
                    grandChild = node.getChild().getChild();
                    node.getChild().setChild(null);
                    node.setChild(grandChild);
                    return true;
                }else{
                    node = node.getChild();
                }
            }
            return false;
        }
    }

    //Returns node with value
    public Node search(int val){
        boolean hasNext = true;

        String result = "";
        Node node;
        try{
            node = head;
        }catch (NullPointerException e){
            return null;
        }
        while (hasNext){
            if (node.getValue() == val){
                return node;
            }else{
                if (node.next() != null){
                    node = node.next();
                }else{
                    return null;
                }
            }
        }
        return null;
    }


}
