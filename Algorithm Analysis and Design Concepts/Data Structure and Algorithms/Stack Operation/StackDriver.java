import java.util.Scanner;

class StackDriver{
    int top = -1;
    int[] stk = new int[100];
    
    public void push(int data){
        stk[++top] = data;
    }
    public int pop(){
        return stk[top--];
    }
    public int findMiddle(){
        if((top+1) % 2 == 0)
            return stk[(int)top/2];
        else
            return stk[(int)(top+1)/2];
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        StackDriver obj = new StackDriver();
        
        System.out.println("Enter the number of elements to be pushed in the stack:");
        int n = scan.nextInt();
        if(n > 0){
            for(int i = 0; i < n; i++){
                System.out.println("Enter the element " +(i+1) + ":");
                obj.push(scan.nextInt());
            }
            System.out.print("The middle element is: " +obj.findMiddle());
            System.out.print("\nThe popped element is: " +obj.pop());
        }
        else
            System.out.println("Invalid Input");
    }
}