public class Clock {
    
    private int hour;
    private int minute;

    public int getHour(){
        return hour;
    }
    public void setHour(int hour){
        if(hour>=0 && hour<=23){  //bylo hour>0 && hour<23
            this.hour = hour;
        }
    }

    public int getMinute(){
        return minute;
    }
    public void setMinute(int minute){
        if(minute>=0 && minute<=59){      //bylo minute>0 && minute<59
            this.minute = minute;
        }
    }
    public void addMinute(){
        if(minute==59 && hour==23){    //ten i drugi if były w odwrotnej kolejności, drugi nie miał dopisanego else
            hour=0;
            minute=0;
        }

        else if(minute==59){
            hour+=1;
            minute=0;
        }

        else { minute+=1; }  //nie bylo tej linijki
    }

    public Clock(int hour, int minute){
        setHour(hour);
        setMinute(minute);
    }

    public static void main(String[] args){
        Clock c = new Clock(23, 58);
        System.out.println(c.getHour());
        System.out.println(c.getMinute());
        c.addMinute();
        System.out.println("\n"+c.getHour());
        System.out.println(c.getMinute());
        c.addMinute();
        System.out.println("\n"+c.getHour());
        System.out.println(c.getMinute());
    }
}
