
public class Email extends Message{
    
    private String subject;
    private User user;
    
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Email(String text, String subject, User user) {
        super(text);
        this.subject = subject;
        this.user = user;
    }
    
    public void send(){
        System.out.println("Subject of message: "+subject);
        System.out.println("Message: "+getText());
        System.out.println("Address of recipient: "+user.getEmail());      
        System.out.println("Length of message: "+charNumber());
    }
    
}
