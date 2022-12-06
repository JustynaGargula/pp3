
public class Ebook extends Book {
    
    private String fileName;

    public Ebook(String title, String author, String fileName){
        super(title, author);
        this.fileName = fileName;
    }
    
    public String getFileName() {
        return fileName;
    }

    public void display(){
        System.out.println("Title: "+getTitle());
        System.out.println("Author: "+getAuthor());
        System.out.println("File name: "+fileName);
    }

    public static void main(String[] args){
        Ebook e = new Ebook("A title", "Am author", "title_author");
        e.display();
    }



}
