public class Truck extends Vehicle{

    public Truck(String brand, int seats, boolean isOn) {
        super(brand, seats, isOn);
    }

    @Override
    public void displayInfo() {
        System.out.println("Brand: "+getBrand());
        System.out.println("Number of seats: "+getSeats());
        System.out.println("Is truck on? : "+getIsOn());          
    }
    
}
