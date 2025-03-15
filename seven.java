/* 7) implement classes for a Library
There are diffrent type of books are available in the
library like Printed books, E books, and Audio books

You must use inhertance, polymorphism, encapuslation...
 */

abstract class Book{
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }
    public abstract void displayInfo();
}