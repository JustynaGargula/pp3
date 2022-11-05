public class InternetDevices{
    //Zad. 16
    
    String name;
    boolean isConnected;
    static int connectedDevices;
    
    public InternetDevices(String n){
        name=n;
    }
    
    public void connect(){
        connectedDevices++;
    }
    
    public void disconnect(){
        connectedDevices--;
    }
    
    public boolean isConnected(){
        return isConnected;
    }
    
    public void displayStatus(){
        System.out.print("Device "+name+" is ");
        if(isConnected == true){
            System.out.println("connected.");
        }
        else { System.out.println("not connected."); }
    }
    
    public static void displayConnections(){
        System.out.println("There are "+connectedDevices+" connected devices.");
    }
    
    public static void main(String[] args){
        InternetDevices dev1 = new InternetDevices("laptop");
        dev1.connect();
        dev1.isConnected=true;
        
        InternetDevices dev2 = new InternetDevices("tablet");
        dev2.connect();
        dev2.isConnected=true;
        
        InternetDevices dev3 = new InternetDevices("smartphone");
        dev3.connect();
        dev3.isConnected=true;
        
        InternetDevices dev4 = new InternetDevices("personal computer");
        dev4.isConnected=false;
        
        InternetDevices dev5 = new InternetDevices("TV");
        dev5.isConnected=false;
        
        dev1.displayStatus();
        dev2.displayStatus();
        dev3.displayStatus();
        dev4.displayStatus();
        dev5.displayStatus();
        displayConnections();
    }
}