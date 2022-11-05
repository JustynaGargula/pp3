public class Clock{
    static int hour;
    static int minute;
    static int alarmHour;
    static int alarmMinute;
    
    Clock(){
        this.hour = 0;
        this.minute = 0;        
    }
    
    Clock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }
    
    
    public static void setClock(int hour1, int minute1){
        hour = hour1;
        minute = minute1;
    }
    
    public static void setClock(){
        hour = 0;
        minute = 0;  
    }
    
    public static void displayTime(){
        if(minute>9){
            System.out.println("This clock claims it is "+hour+":"+minute);
        }
        else{
            System.out.println("This clock claims it is "+hour+":0"+minute);
        }
        
    }
    
    public static void addOneMinute(){
        if(minute == 59){
            if(hour == 23){
                hour = 0;
            }
            else{
                hour++;
            }           
            minute = 0;
        }
        else{
            minute++;
        }
        
        if(alarmHour == hour && alarmMinute == minute){
            runAlarm();
        }
    }
    
    public static void setAlarm(int hour1, int minute1){
        alarmHour = hour1;
        alarmMinute = minute1;
    }
    
    public static void runAlarm(){
        System.out.println("beep-beep-beep-beep !!");
    }
    
    
    public static void main(String[] args){
        Clock c1 = new Clock(12, 47);
        displayTime();
        c1.setClock(18, 14);
        displayTime();
        c1.setClock(9, 3);
        displayTime();
        c1.setAlarm(23,59);
        setClock(23, 58);
        displayTime();
        c1.addOneMinute();
        displayTime();
        c1.addOneMinute();
        displayTime();
        
    }
}