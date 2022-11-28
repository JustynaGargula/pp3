public class Book {
    
    private String title;
    private String author;
    private String genre;

    public void displayInfo(){
        System.out.println("Author: "+author+"\nTitle: "+title
        +"\nGenre: "+genre);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public static void main(String[] args){
        Book b = new Book("Narnia", "C.S.Lewis", "fantasy");
        b.displayInfo();
    }    
   

}
