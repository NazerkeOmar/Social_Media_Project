package Social_Media_Task;

public abstract class SocialMedia {

    public String personalUrl;
    public int accountLength;
    public String platform;
    public String username;
    public String password;
    public String fullName;


    public abstract void directMessaging(String username, String message);
    public abstract void post(Object body);
    public abstract void notification();


}
