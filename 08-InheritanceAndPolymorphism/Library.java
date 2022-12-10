import java.util.ArrayList;

public class Library{
    ArrayList <Book> bookCase = new ArrayList<Book>();

    //te trzy metody powodują, że między klasą Library i Book jest relacja agregacji, 
    //a miała być kompozycja. Do tego trzeba by tworzyć obiekty na zewnatrz i tylko odwoływać się do nich tu

    public void addBook(String title, Writer author, int yearOfpubliation, Publisher publisher){                  
        Book book = new Book(title, author, yearOfpubliation, publisher);
        bookCase.add(book);
    }

    public void addBook(String title, Writer author, int yearOfpubliation,  Publisher publisher, String fileName){
        Ebook book = new Ebook(title, author, yearOfpubliation, publisher, fileName);
        bookCase.add(book);
    }

    public void addBook(String title, Writer author, int yearOfpubliation, Publisher publisher, int minutes, int seconds){
        Audiobook book = new Audiobook(title, author, yearOfpubliation, publisher, minutes, seconds);
        bookCase.add(book);
    }
    
    public void display(){
        for(Book item: bookCase){
            item.display();
            System.out.println();
        }
    }

    public static void main(String[] args){

    }

}