package LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(new int[]{1, 2, 3, 4, 5});


        l.print();

        System.out.println(l.contains(1));

        l.reverse();

        l.print();
    }
}
