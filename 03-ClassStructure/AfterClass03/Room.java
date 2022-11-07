import java.util.Scanner;

public class Room {
    int number;
    int beds;
    boolean occupied;
    String guestName;
    
    public Room(int number){
        this.number = number;
        beds = 2;
    }
    
    public Room(int number, int beds){
        this.number = number;
        this. beds = beds;
    }
    
    public void checkin(String guestName){
        this.guestName = guestName;
    }
    
    public void checkout(){
        
    }
    
    public boolean isOccupied(){
        return occupied;
    }
    
    public void displayStatus(){
        System.out.println(toString());
    }
    
    public String toString(){
        String text = "Room "+this.number+" has "+this.beds+" beds. ";
        if(occupied == true){
            text+= "This room is occupied. ";
            text+="Currently "+this.guestName+" lives here.";
        }
        else {
            text+="This room isn't occupied."; 
        }
        return text;
    }
    
    public static void main(String[] args){
        Room[] rooms = new Room[6];
        rooms[0] = new Room(1,2);
        rooms[1] = new Room(2,2);
        rooms[2] = new Room(3,2);
        rooms[3] = new Room(4,3);
        rooms[4] = new Room(5,3);
        rooms[5] = new Room(6,1);
        
        a(rooms);
        b(rooms);
        c(rooms);
        d(rooms);
        e(rooms);
    }
    
    public static void a(Room[] rooms){
        System.out.println("a)");
        rooms[5].displayStatus();
    }
    
    public static void b(Room[] rooms){
        System.out.println("b)");
        for(int i=0; i<6; i++){
            rooms[i].displayStatus();
        }
    }

    public static void c(Room[] rooms){
        System.out.println("c)");
        Scanner in = new Scanner(System.in);
        System.out.println("How many beds do you want? ");
        int tempBeds = in.nextInt();
        for(int j=0; j<6; j++){
            if(tempBeds == rooms[j].beds){
                rooms[j].displayStatus();
            }
        }
    }
    
    public static void d(Room[] rooms){
        System.out.println("d)");
        int vacantRooms = 0;
        int occupiedRooms = 0;
        for(int i=0; i<6; i++){
            if(rooms[i].occupied == true){
                occupiedRooms++;
            }
            else{
                vacantRooms++;
            }
        }
        System.out.println(occupiedRooms+" rooms are occupied and "+vacantRooms+" are vacant.");

    }
    
    public static void e(Room[] rooms){
        System.out.println("e)");
        int vacantBeds = 0;
        for(int i=0; i<6; i++){
            if(rooms[i].occupied == false){
                vacantBeds+=rooms[i].beds;
            }
        }
        System.out.println("There are "+vacantBeds+" vacant beds.");
    }
}
