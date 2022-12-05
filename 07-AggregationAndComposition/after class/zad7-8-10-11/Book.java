
public class Book {
    private String title;
    private String author;
    private int pages;
    private int currentPage=1;
    
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    
    public Book(String title, String author, int pages, int currentPage) {
        setTitle(title);
        setAuthor(author);
        setPages(pages);
        setCurrentPage(currentPage);
    }

    public void displayInfo(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Pages in book: "+pages);
        System.out.println("You are on page number: "+currentPage);
    }

    public void flipPage(){
        currentPage++;
    }

    public static void main(String[] args){
        
    }

    
}
