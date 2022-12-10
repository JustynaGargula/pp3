
public class Writer {
    private String writerName;
    private String writerLastName;
    private String literaryGenre;
    

    public Writer(String writerName, String writerLastName, String literaryGenre) {
        this.writerName = writerName;
        this.writerLastName = writerLastName;
        this.literaryGenre = literaryGenre;
    }
    public String toString(){
        return "Name of writer: "+writerName+"\nLast name of writer: "+writerLastName+"\nLiterary genre of writer: "+literaryGenre;
    }

    public void display(){
        System.out.println("Name of writer: "+writerName);
        System.out.println("Last name of writer: "+writerLastName);
        System.out.println("Literary genre of writer: "+literaryGenre);
    }

    public static void main(String[] args){
        /* 
        Writer w = new Writer("Frank", "Okey", "Adventure");
        //w.display();
        System.out.println(w);
        */
    }
}
