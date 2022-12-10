
public class Audiobook extends Book{
    private int minutes;
    private int seconds;
    
    public Audiobook(String title, Writer author, int yearOfpubliation, Publisher publisher, int minutes, int seconds) {
        super(title, author, yearOfpubliation, publisher);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public void display(){
        System.out.println("Title: "+getTitle());
        System.out.println(getAuthor());
        System.out.println("Minutes: "+getMinutes());
        System.out.println("Seconds: "+getSeconds());
        System.out.println("Year of publication: "+getYearOfpubliation());
        System.out.println(getPublisher());
    }
    
    public static void main(String[] args){

    }    

}
