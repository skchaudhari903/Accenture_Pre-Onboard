import java.util.Scanner;

class Node{
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        next = null;
    }
}

class LinkedList{
    Node head;
    void append(int data){
        Node newNode = new Node(data);
        Node current = head;
        if(head == null)
            head = newNode;
        else{
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public void reverse(){
        Node preNode = null;
        Node  nextNode;
        Node currNode = head;
        while(currNode != null){
            nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }
        head = preNode;
    }
}

public class List{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        LinkedList list = new LinkedList();
        String ch;
        
        do{
            System.out.println("Enter the value:");
            int val = scan.nextInt();
            list.append(val);
            System.out.println("Do you want to add another node? Type Yes/No");
            
            ch = scan.next();
        }while(ch.equals("Yes") || (ch.equals("yes")));
        
        System.out.println("The elements in the linked list are:");
        list.display();
        list.reverse();
        System.out.println("The elements in the reversed linked list are :");
        list.display();
    }
}