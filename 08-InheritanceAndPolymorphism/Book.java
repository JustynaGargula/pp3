
public class Book{
    
    private String title;
    private Writer author;
    private Publisher publisher;
    private int yearOfpubliation;

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author.toString();
    }
    public Publisher getPublisher() {
        return publisher;
    }

    public int getYearOfpubliation(){
        return yearOfpubliation;
    }
    public void setYearOfpubliation(int yearOfpubliation){
        this.yearOfpubliation = yearOfpubliation;
    }

    public Book(String title, Writer author, int yearOfpubliation, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.yearOfpubliation = yearOfpubliation;
        this.publisher = publisher;
    }

    public void display(){
        System.out.println("Title: "+title);
        System.out.println(author);
        System.out.println("Year of publication: "+yearOfpubliation);
        System.out.println(publisher);
    }

    public static void main(String[] args){
        /*
        private Writer writer;
        Book b = new Book("Something", writer, 1998, "Name", "Place");
        b.display(); 
        */
    }
}