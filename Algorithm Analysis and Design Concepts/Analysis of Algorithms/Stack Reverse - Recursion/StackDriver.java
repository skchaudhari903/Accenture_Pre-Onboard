import java.util.Scanner;

class Stack{
    Node head;
    
    public class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
            next = null;
        } 
    }
    public int createStack(int value){
        Node newNode = new Node(value);
        Node current = head;
        if(head == null)
            head = newNode;
        else{
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        return value;
    }
    public void displayStack(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
    public void stackReverse(Node current){
        if(current == null)
            return;
        if(current.next == null){
            this.head = current;
            return;
        }
        stackReverse(current.next);
        current.next.next = current;
        current.next = null;
    }
}
class StackDriver{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter length of List: ");
        int len = scan.nextInt();
        Stack stack = new Stack();
        if(len <= 0)
            System.out.println("Invalid Length");
        else{
            System.out.println("Elements in Stack");
            for(int i = 0; i < len; i++)
                System.out.print(stack.createStack(i+1) + " ");
            stack.stackReverse(stack.head);
            System.out.println("\nElements in the stack after reversal");
            stack.displayStack();
        }
    }
}