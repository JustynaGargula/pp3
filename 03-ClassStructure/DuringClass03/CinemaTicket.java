public class CinemaTicket{
    
    static String cinemaName = "Cinema City";
    String filmTitle;
    int row;
    int seat;
    double price;
    
    
    //constructor:
    public CinemaTicket(String f, int r, int s){
        filmTitle = f;
        row = r;
        seat = s;
        
        double price;
        if (row==1 || row==2){
            price = 10.0;
        }
        else {price = 25.0;}
        
    }
    
    public void displayData(){
        System.out.println("Ticket data: "+cinemaName+" \""+filmTitle+"\" row-"
        +row+" seat-"+seat+" price-"+price);
    }
    
    public static void main(String[] args){
        CinemaTicket t1 = new CinemaTicket("cos", 2, 4);

        
        CinemaTicket t2 = new CinemaTicket("nwm", 7, 7);
    
        
        t1.displayData();
        t2.displayData();
    }
}