import java.util.Scanner;

class BinarySearch{
    public static void binarySearch(int arr[], int first, int last, int key){
        int mid = (first + last) / 2;
        while(first <= last){
            if(arr[mid] < key)
                first = mid + 1;
            else if(arr[mid] == key){
                System.out.println(key + " is the score of Team " +(mid+1));
                break;
            }
            else
                last = mid-1;
            mid = (first + last) / 2;
        }
        if(first > last)
            System.out.println("Score Not Found");
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of Teams:");
        int num = scan.nextInt();
        int scores[] = new int[num];
        System.out.println("Enter the score:");
        for(int i = 0; i < num; i++)
            scores[i] = scan.nextInt();
        System.out.println("Enter the score to be searched:");
        int key = scan.nextInt();
        binarySearch(scores, 0 , num-1, key);
    }
}