public class Car extends Vehicle{
    
    public Car(String brand, int seats, boolean isOn){
        super(brand, seats, isOn);
    }

    public void displayInfo(){
        System.out.println("Brand: "+getBrand());
        System.out.println("Number of seats: "+getSeats());
        System.out.println("Is car on? : "+getIsOn());
    }
}
