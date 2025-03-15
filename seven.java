/* 7) implement classes for a Library
There are diffrent type of books are available in the
library like Printed books, E books, and Audio books

You must use inhertance, polymorphism, encapuslation...
 */

class Book{
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public void displayInfo(){
        System.out.println("Book: "+ title + " by "+ author);
    }
}
class PrintedBook extends Book{
    private int pages;

    public PrintedBook(String title, String author, int pages){
        super(title, author);
        this.pages = pages;
    }
    public void displayInfo(){
        System.out.println("Printed book: "+ getTitle() + " by " + getAuthor() + ", PAges: "+ pages );
    }
}

class EBook extends Book{
    private double fileSize;

    public EBook(String title, String author, double fileSize){
        super(title, author);
        this.fileSize = fileSize;
    }
    public void displayInfo(){
         System.out.println("E-Book: " + getTitle() + " by " + getAuthor() + ", File Size: " + fileSize + "MB");
    }
}

public class Library{
    public static void main(String[] args){
        Book book1 = new PrintedBook("Java Basics", "John Doe", 300);
        Book book2 = new EBook("Python Guide", "Jane Smith", 2.5);

        book1. displayInfo();
        book2.displayInfo();
    }
}