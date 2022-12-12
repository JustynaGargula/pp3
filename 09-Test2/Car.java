
public class Car extends Vehicle{
    private int maxSpeed;

    public Car(int seats, int maxSpeed){
        super(seats);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec(){
        int [] myArr = {getSeats(), maxSpeed};
        return myArr;
    }
}
