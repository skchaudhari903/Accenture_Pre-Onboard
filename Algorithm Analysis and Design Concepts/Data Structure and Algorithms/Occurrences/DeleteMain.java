import java.util.Scanner;

class DeleteMain{
    static Node head;
    
    private static class Node{
        private int data;
        private Node next;
        
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    public void append(int data){
        Node newNode = new Node(data);
        if(head == null)
            head = newNode;
        else{
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
    }
    public Node deleteAllOccurences(Node head, int x){
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == x)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
        if(head.data == x)
            head = head.next;
        return head;
    }
    public void display(){
        Node tnode = head;
        while(tnode != null){
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        DeleteMain obj = new DeleteMain();
        int num = scan.nextInt(); 
        if(num > 0){
            int val = 0;
            for(int i = 1; i <= num; i++){
                val = scan.nextInt();
                obj.append(val);
            }
            System.out.print("Enter the element to be deleted: ");
            int key = scan.nextInt();
            System.out.print("The list after deletion: ");
            obj.head = obj.deleteAllOccurences(head, key);
            obj.display();
        }
        
    }
}