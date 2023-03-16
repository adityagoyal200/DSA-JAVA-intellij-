import java.util.Scanner;

public class LinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes in the list: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the data of node " + i + ": ");
            int data = sc.nextInt();
            list.insertAtBegin(data);
        }
        list.display();
        list.reverse();
        list.display();
        list.insertAtEnd(0);
        list.display();
        list.insertAtPosition(2,45);
        list.display();
        list.deleteAtAny(2);
        list.display();
    }

    public static void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void insertAtBegin(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public static void reverse() {
        Node prev = null,curr=head,next=null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void insertAtEnd(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public static void insertAtPosition(int pos, int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else if(pos<1){
            System.out.println("invalid");
        }
        else{
            Node temp=head,temp2=head.next;
            while (pos != 1 && temp2 != null) {
                temp = temp.next;
                temp2 = temp2.next;
                pos--;
            }
            if (pos > 0 && temp2 == null) {
                System.out.println("invalid");
            }
            else{
                temp.next = newNode;
                newNode.next = temp2;
            }
        }
    }
    public static void deleteAtAny(int pos){
        if(head==null){
            System.out.println("no list");
        }
        else if(pos<1){
            System.out.println("invalid");
        }
        else{
            Node temp=head,temp2=head.next;
            while(pos!=1&&temp2!=null){
                temp=temp.next;
                temp2=temp2.next;
                pos--;
            }
            if(pos>0&&temp2==null){
                System.out.println("invalid");
            }
            else{
                temp.next=temp2.next;
            }
        }
    }
}


