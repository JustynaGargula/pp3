
public class Car {
    
    private String brand;
    private String color;
    private int doorsNum;
    private String type;
    private int speedometer;

    public void drive(){}

    public void changeColor(String newColor){
        color = newColor;
    }

    public int checkSpeed(){
        return speedometer;
    }

    public void setBrand(String brand){
        this.brand = brand; }

    public void setColor(String color){
        this.color= color; }

    public void setType(String type){
        this.type = type; }

    public void setDoorsNum(int doorsNum){
        this.doorsNum = doorsNum; }

    public void setSpeedometer(int speedometer){
        this.speedometer = speedometer; }
    
    public Car(String brand, String color, int doorsNum, String type, int speedometer){
        setBrand(brand);
        setColor(color);
        setDoorsNum(doorsNum);
        setType(type);
        setSpeedometer(speedometer);
    }

    public static void main(String[] args){
        Car c = new Car("Mustang", "red", 2, "sportscar", 100);
        
    }
}
