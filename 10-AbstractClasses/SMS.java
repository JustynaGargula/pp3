
public class SMS extends Message{

    private User user;

    public SMS(String text, User user) {
        super(text);
        this.user = user;
    }

    public void send(){
        System.out.println("Message: "+getText());
        System.out.println("Phone number of recipient: "+user.getPhoneNumber());
        System.out.println("Length of message: "+charNumber());
    }

}
