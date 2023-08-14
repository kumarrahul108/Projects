
/*
        Create a library management system which is capable of issuing books to the students.
        
        Book should have info like:
            1. Book name    
            2. Book Author
            3. Issued to
            4. Issued on
        User should be able to add books, return issued books, issue books

        Assume that all the users are registered with their names in the central database

*/



import java.util.*;

class Book 
{
    public String name , author ;

    public Book(String name, String author) 
    {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString()
    {
        return "Book{" + "name = " + name + "  " + ", author = " + author + " " + "}";
    }
}



class Library 
{
    public ArrayList<Book> books;

    public Library(ArrayList<Book> books) 
    {
        this.books = books;
    }


    public void addBook(Book book)
    {
        System.out.println("The Book has been added to the Library !");
        this.books.add(book);
    }


    public void issueBook(Book book , String issued_to)
    {
        System.out.println("The Book has been issued from the Library to " + issued_to);
        this.books.remove(book);
    }


    public void returnBook(Book b , String issue_on)
    {
        System.out.println("The Book has been returned to the Library  " + issue_on);
        this.books.add(b);
    }
 
    
}



class Project_6
{
    public static void main(String[] args)
    {

        // Creating ArrayList for Books
        ArrayList<Book> bk = new ArrayList<>();

        Book b1 = new Book("Algorithms" , "CLRS");
        bk.add(b1);

        Book b2 = new Book("Algorithms2" , "CLRS2");
        bk.add(b2);

        Book b3 = new Book("Algorithms3" , "CLRS3");
        bk.add(b3);

        Book b4 = new Book("Java" , "S.Arora");
        bk.add(b4);

        Book b5 = new Book("Python" , "R.Aryan");
        bk.add(b5);


        // Creating Object Instantation
        Library l = new Library(bk);

        l.addBook(new Book("algo4", "myauthor"));

        System.out.println(l.books);

        l.issueBook(b3, "Rohan Verma");

        System.out.println(l.books);
    }
}