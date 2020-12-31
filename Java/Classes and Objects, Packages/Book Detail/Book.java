public class Book{
    private String bookName;
    private int bookPrice;
    private String authorName;
    
    public void setBookName(String name){
        this.bookName = name;
    }
    public void setBookPrice(int price){
        this.bookPrice = price; 
    }
    public void setAuthorName(String author){
        this.authorName = author;
    }
    public String getBookName(){
        return bookName;
    }
    public int getBookPrice(){
        return bookPrice;
    }
    public String getAuthorName(){
        return authorName;
    }
}