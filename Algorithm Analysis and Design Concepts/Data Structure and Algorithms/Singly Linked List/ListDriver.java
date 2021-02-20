import java.util.*;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
}
class ListDriver{
    Node head;
    public void append(int data){
        Node newNode = new Node(data);
        if(head == null)
            head = newNode;
        else{
            Node last = head;
            while(last.next != null)
                last = last.next;
            last.next = newNode;
        }
    }
    public int isPalindrome(){
        Node current = head;
        int isPalin = 1;
        Stack<Integer> stack = new Stack<Integer>();
        while(current != null){
            stack.push(current.data);
            current = current.next;
        }
        while(head != null){
            int i = stack.pop();
            if(head.data != i){
                isPalin = 0;
                break;
            }
            head = head.next;
        }
        return isPalin;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        ListDriver obj = new ListDriver();
        int size = scan.nextInt();
        for(int i = 0; i < size; i++)
            obj.append(scan.nextInt());
        System.out.println(obj.isPalindrome());
    }
}