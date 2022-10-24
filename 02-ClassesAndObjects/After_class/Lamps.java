public class Lamps{
    boolean isOn;
    
    public void switchOn(){
        isOn = true;
    }
    
    public void switchOff(){
        isOn = false;
    }
    
    public void displayStatus(){
        System.out.println("Is lamp on? "+isOn);
    }
    
    public static void main(){
        Lamps lamp1 = new Lamps();
        lamp1.switchOn();
        lamp1.displayStatus();
        
        Lamps lamp2 = new Lamps();
        lamp2.switchOff();
        lamp2.displayStatus();
        
    }
}