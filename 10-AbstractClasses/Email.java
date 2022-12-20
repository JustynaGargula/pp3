
public class Email extends Message{
    
    private String subject;
    private String address;
    
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Email(String text, String subject, String address) {
        super(text);
        this.subject = subject;
        this.address = address;
    }
    
    public void send(){
        System.out.println("Subject of message: "+subject);
        System.out.println("Message: "+getText());
        System.out.println("Address of recipient: "+address);      
        System.out.println("Length of message: "+charNumber());
    }
    
}
