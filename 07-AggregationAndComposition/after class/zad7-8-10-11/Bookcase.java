import java.util.ArrayList;

public class Bookcase {
    private ArrayList <String> bookcase = new ArrayList<String>();
    private Book book;

    public void displayBooks(){
        System.out.println("\nBookcase:");
        for(String i: bookcase){
            System.out.println(i);
        }
    }

    public void displayAmountOfBooks(){
        System.out.println(bookcase.size());
    }

    public void addBook(String title, String author, int pages, int currentPage){
        this.book = new Book(title, author, pages, currentPage);
        bookcase.add(title);
    }

    public void removeBook(String title){
        int i = 0;
        boolean isTrue = true;
        while(i<bookcase.size() || isTrue){
            if(bookcase.get(i)==title){
                bookcase.remove(i);
                isTrue = false;
            }
            i++;
        }
    }
    public static void main(String[] args){

    }
}
