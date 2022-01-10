import java.util.LinkedList;

public class p1 {

     
   Node head;
   private int size;
 
   p1 () {
       size = 0;
   }
 
   public class Node {
       String data;
       Node next;
 
       Node(String data) {
           this.data = data;
           this.next = null;
           size++;
       }
   }
 
   public void addFirst(String data) {
       Node newNode = new Node(data);
       newNode.next = head;
       head = newNode;
       size++;
   }

   public void addLast(String d){
       Node n = new Node(d);
       Node cn = head;
       while(cn.next != null){
           cn = cn.next;
       }
       cn.next= n;
       size++;
   }
   
   public void printList() {
    Node currNode = head;

    while(currNode != null) {
        System.out.print(currNode.data+" -> ");
        currNode = currNode.next;
    }

    System.out.println("null");
}

    public void deleteFirst(){
        if(head == null){
            System.out.println("list empty");
        }
        head = head.next;
        size--;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("empty list");
        }

        Node cn = head;
        while(cn.next.next != null){
            cn = cn.next;
        }
        cn.next = null;
        size--;
    }

    public void revIterate(){
        Node prev = head;
        Node curr = head.next;
        
        if(head == null || head.next ==null ){
            return;
        }
        while(curr != null){
            Node Next = curr.next;
            //update
            curr.next= prev;
            prev = curr;
            curr = Next;
        }
        head.next = null;
        head=prev;

    } 

    public Node revRecursive(Node head){

        //cornercase
        if(head== null || head.next == null){
            return head;
        }
        Node newHead =  revRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }

    // find the nth node from last of the LL and delete that node.
    public Node nthfromLast(Node head, int n){
        //find size of linkedlist

        if(head.next == null ){
            return head;
        }
        int size=0;
        Node curr =head;
        while(curr != null){
            curr = curr.next;
            size ++;
        }
        System.out.println(size);

        if(n == size){
            return head.next;
        }

        //find the nth node
        int pst= size -n;  // previous position of the nth node;
        int i = 1;
        Node prev = head;
        while(i != pst){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;

    }

    public void palindrom (Node head){
        //calc size

        if(head == null || head.next == null){
            System.out.println("empty list");
        }


        int size =0;
        Node c = head;
        while(c != null){
            c= c.next;
            size++;
        }

        // find the mid element
        int mid = (size/2) + 1;
        int i =1;
        Node n = head;
        while( i != mid){
            n = n.next;
            i++;
        }

        Node revL = revRecursive(n);
        Node fh = head;
        while(fh != null){
            if(fh.data == revL.data){
                System.out.println("Palindrom");
                break;
            }
            else{
                System.out.println("Not palindrom");
                fh = fh.next;
                break;
                
            }
            
        }

    }

    
    
    
    public static void main (String args[]){
        p1 L = new p1();
     
       
        // L.addLast("1");
        // L.addLast("8");
        // L.addFirst("30");
        // L.printList();

        // L.deleteLast();
        // L.printList();

        // L.deleteFirst();
        // L.printList();
        // L.revIterate();
        // L.printList();
        L.addFirst("1");
        L.addFirst("2");
        L.addFirst("1");
        // L.addLast("1");
        // L.printList();
        // L.head= L.revRecursive(L.head);
        // L.printList();
        // L.nthfromLast(L.head, 1);
        L.printList();
        L.palindrom(L.head);
    }


}
