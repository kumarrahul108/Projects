
/*  Program : Implement a Libraray using Java Class Library

             Methods     :-> addBook , issueBook , returnBook , showAvailableBook ,  
             Properties  :-> Array to store the available books 
                             Array to store the issued books 


*/



class Libraray 
{
    String books[];
    int no_of_books;

    Libraray()
    {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book)
    {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been Added to the Central Library !");
    }

    void showAvailableBook()
    {
        System.out.println("\nAvailable Books are : \n ");
        for(String book:this.books)
        {
            if(book == null)
            {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book)
    {

        for(int i =0; i<this.books.length; i++)
        {
            String b = this.books[i];
            if(b == book)
            {
                System.out.println("The book has been issued !");
                this.books[i] = null;
                return;
                
            }            
        }
        System.out.println("This book does not exist !");
    }

    void returnBook(String book)
    {
        addBook(book);
    }

}





class Project_5 
{
    public static void main(String[] args)
    {
        Libraray centrLibraray = new Libraray();

        centrLibraray.addBook("Think and Grow Rich ");
        centrLibraray.addBook("Algorithm");
        centrLibraray.addBook("C++");
        centrLibraray.addBook("Python");
        centrLibraray.addBook("Java");

        centrLibraray.showAvailableBook();

        centrLibraray.issueBook("Java");

        centrLibraray.showAvailableBook();

        centrLibraray.returnBook("Django");

        centrLibraray.showAvailableBook();
    }
}