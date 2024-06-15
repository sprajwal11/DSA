public class LinkedListQ {

    private static Node head;
    public static Node tail;


    private static class Node {

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void removeDuplicates() {
        if (head == null) {
            return;
        }
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    void addFirst(int data) {
        //step 1: create new node
        Node newNode = new Node(data);
        if (head==null){
            head=tail=newNode;
            return;
        }

        //step 2: newNode next=head
        newNode.next=head;

        //step 3: Head=newNode
        head=newNode;
    }

    void addLast(int data){
        //step 1: create new node
        Node newNode = new Node(data);
        if (head==null){
            head=tail=newNode;
            return;
        }

        //step 2: tail will point to newNode
        tail.next=newNode;

        //step 3: tail=newNode
        tail=newNode;
    }

    static void printLinkedList(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {

        LinkedListQ ll = new LinkedListQ();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.printLinkedList();
    }


}
