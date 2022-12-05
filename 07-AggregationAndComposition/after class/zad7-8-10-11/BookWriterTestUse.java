
public class BookWriterTestUse {
    public static void main(String[] args){
        Book b = new Book("Narnia", "C.S. Levis", 206, 1);
        b.displayInfo();
        System.out.println();
        b.flipPage();
        b.displayInfo();
        System.out.println();

        Writer w = new Writer("Henryk", "Sienkiewicz");
        w.displayInfo();
        System.out.println();

        Bookcase bc = new Bookcase();
        bc.addBook("Narnia: Silver chair", "C.S. Levis", 250, 1);
        bc.displayBooks();
        bc.addBook("Narnia: Prince Caspian", "C.S. Levis", 300, 1);
        bc.displayBooks();
        bc.removeBook("Narnia: Prince Caspian");
        bc.displayBooks();
    }
}
