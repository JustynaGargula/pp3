
public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume{
    private boolean isOn = false;
    private int channelNo = 1;
    private int volume = 1;
    private String[] list = new String[99];

    public TV() {
        list[0] = "TVP 1";
        list[1] = "TVP 2";
        list[2] = "TVP Info";
        list[3] = "TV 4";
        list[4] = "Polsat";
        list[5] = "TV 6";
        list[6] = "TV Puls";
        list[7] = "Puls 2";
        list[8] = "TVP ABC";
        list[9] = "Super Polsat";
    }

    public void displayStatus(){
        if(isOn == true){
            System.out.print("Tv is on");
            System.out.print("\tCurrent channel : "+channelNo+". "+list[channelNo-1]);
            System.out.println("\tCurrent volume level: "+volume);
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

    @Override
    public void volumeDown() {
        if(isOn == false){
            System.out.println("Invalid operation. Turn on tv.");
        }
        else if(volume == 1){
            System.out.println("Minimum volume. Can't go lower.");
        }
        else{
            volume--;     
        }  
    }

    @Override
    public void volumeUp() {
        if(isOn == false){
            System.out.println("Invalid operation. Turn on tv.");
        }
        else if(volume == 10){
            System.out.println("Maximum volume. Can't go higher.");
        }
        else{
            volume++;     
        }  
    }
    

    public void displayList(){
        System.out.println("List of channels on tv:");
        for(int i=0; i<list.length; i++){
            int j=i+1;
            System.out.println(j+". "+list[i]);
        }
    }

    public static void main(String[] args) {
        
    }
}