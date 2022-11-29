
public class Computer{

    private String brand;
    private int memory;
    private String color;
    private int plugInsNumber;
    private boolean isFanOn;
    private boolean isOn;
    private Processor processor;           //łączy z klasą Processor

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPlugInsNumber(int plugInsNumber) {
        this.plugInsNumber = plugInsNumber;
    }

    public void setIsFanOn(boolean isFanOn) {
        this.isFanOn = isFanOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }

    public void runProgram(double a, double b){
        processor.sum(a,b);
    }

    

    public Computer(String brand, int memory, String color, int plugInsNumber, boolean isFanOn, boolean isOn) {
        setBrand(brand);
        setMemory(memory);
        setColor(color);
        setPlugInsNumber(plugInsNumber);
        setIsFanOn(isFanOn);
        setIsOn(isOn);
        this.processor = new Processor("", "", "", 0, 0);
        //powyzsza instrukcja zapewnia relacje kompozycji
    }

    public static void main(String[] args){
        Computer c = new Computer(null, 0, null, 0, false, false);
        c.turnOn();
        c=null; //wtedy usunie obiekt procesora utworzon w konstruktorze

    }
}