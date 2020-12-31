import java.util.Scanner;

public class TestBook{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Book book = new Book();
        System.out.println("Enter the Book name:");
        String name = scan.next();
        book.setBookName(name);
        System.out.println("Enter the price:");
        int price = scan.nextInt();
        book.setBookPrice(price);
        System.out.println("Enter the Author name:");
        String author = scan.next();
        book.setAuthorName(author);
        
        System.out.println("Book Details");
        System.out.println("Book Name :" +book.getBookName());
        System.out.println("Book Price :" +book.getBookPrice());
        System.out.println("Author Name :" +book.getAuthorName());
    }
}