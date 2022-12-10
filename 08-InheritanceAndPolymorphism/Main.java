
public class Main {
    
    public static void main(String[] args){
        Writer author = new Writer("Levis", "Hallway", "drama");
        Publisher publisher = new Publisher("Grand Publisher", "Greenwich");
        Library lib = new Library();
        lib.addBook("Long way", author, 1997, publisher);
        lib.addBook("Flying", author, 1998, publisher, "sienna_carter_flying.mobi");
        lib.addBook("Stay out not in", author, 2005, publisher, "mark_doc_stay_out_not_in.mobi");
        lib.addBook("Birds sing",author, 2020, publisher, 32, 07);
        lib.addBook("Dogs are real",author, 2018, publisher, 76, 19);
        lib.display();
    }
}
