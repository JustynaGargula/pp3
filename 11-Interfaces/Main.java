public class Main {
    
    public static void main(String[] args) {
        TV t = new TV();
        t.on();
        t.displayStatus();
        t.setChannel(15);
        t.volumeUp();
        t.volumeUp();
        t.volumeUp();
        t.volumeUp();
        t.volumeUp();
        t.volumeUp();
        t.displayStatus();
        t.off();
        t.displayStatus();
        t.displayList();
    }
}
