
public class TV implements CanOnOff, CanChangeChannel{
    private boolean isOn = false;
    private int channelNo = 1;

    public void displayStatus(){
        if(isOn == true){
            System.out.println("Tv is on");
            System.out.println("Current channel number: "+channelNo);
        }
        else{
            System.out.println("Tv is off");
        }
    }

    @Override
    public void on() {
        isOn = true;        
    }

    @Override
    public void off() {
        isOn = false;
    }

    @Override
    public void channelDown() {             //można też przekazać do funkcji setChannel(channelNo--) tam sprawdzi warunki
        if(isOn){
            if(channelNo == 1){
                channelNo = 99;
            }
            else{
                channelNo--;
            }
        }
        else{
            System.out.println("Tv is off. Turn it on to change channel.");
        }
        
    }

    @Override
    public void channelUp() {
        if(isOn){
            if(channelNo == 99){
                channelNo = 1;
            }
            else{
                channelNo++;
            }
        }
        else{
            System.out.println("Tv is off. Turn it on to change channel.");
        }
    }

    @Override
    public void setChannel(int channelNo) {
        if(isOn){
            if(channelNo >99 || channelNo<1){
                System.out.println("Wrong number");
            }
            else{
                this.channelNo = channelNo;
            }            
        }
        else{
            System.out.println("Tv is off. Turn it on to change channel.");
        }
        
    }
    
}
