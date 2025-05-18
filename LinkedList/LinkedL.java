public class LinkedL {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // adding element to the begining
    public void AddAtBeg(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //printing entire linked list
    public void printList(){
        if(head==null){
            System.out.print("The list is empty");
            return;
        }
        Node current=head;
        while (current!=null) {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.print("NULL");

    }

    public static void main(String[] args){
        LinkedL list= new LinkedL();
        list.AddAtBeg(1);
        list.AddAtBeg(2);
        list.printList();
    }
}
