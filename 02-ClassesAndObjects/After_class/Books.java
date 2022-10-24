public class Books{
    //Attributes
    String title;
    String author;
    int length;
    
    //Methods
    
    public void displayInfo(){
        System.out.println(author+" \""+title+"\"\tLength: "+length);
    }
    
    public static void main(String[] args){
        Books book1 = new Books();
        book1.title ="Alice's Adventures in Wonderland";
        book1.author ="Lewis Caroll";
        book1.length = 320;
        
        book1.displayInfo();
        
        Books book2 = new Books();
        book2.title ="Narnia";
        book2.author ="C.S. Lewis";
        book2.length = 224;
        
        book2.displayInfo();
    }
}