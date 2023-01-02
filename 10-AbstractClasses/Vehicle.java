public abstract class Vehicle {
    
    private String brand;
    private int seats;
    private boolean isOn;
    
    public Vehicle(String brand, int seats, boolean isOn) {
        this.brand = brand;
        this.seats = seats;
        this.isOn = isOn;
    }
    

    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public int getSeats() {
        return seats;
    }


    public void setSeats(int seats) {
        this.seats = seats;
    }


    public boolean getIsOn() {
        return isOn;
    }


    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }


    public  void turnOn(){
        isOn = true;
    }

    public  void turnOff(){
        isOn = false;
    }

    public abstract void displayInfo();

    
}
