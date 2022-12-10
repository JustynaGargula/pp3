
public class Ebook extends Book {
    
    private String fileName;

    public Ebook(String title, Writer author, int yearOfpubliation, Publisher publisher, String fileName){
        super(title, author, yearOfpubliation, publisher);
        this.fileName = fileName;
    }
    
    public String getFileName() {
        return fileName;
    }

    public void display(){
        System.out.println("Title: "+getTitle());
        System.out.println(getAuthor());
        System.out.println("File name: "+fileName);
        System.out.println("Year of publication: "+getYearOfpubliation());
        System.out.println(getPublisher());
    }

    public static void main(String[] args){
        /*
        Ebook e = new Ebook("A title", "Am author", 2003, "Random Name", "City", "title_author");
        e.display();
        */
    }



}
