package Social_Media_Task;
import java.time.LocalTime;
import java.util.ArrayList;

public class Facebook extends SocialMedia implements HasGroups {

    private int age;
    private int numOfFriends;
    private ArrayList<Post> posts;
    private int numberOfGroups;

    public Facebook(String username, String password) {
        platform = "Facebook";
        this.username = username;
        if(password.contains(this.username)){
            System.out.println("Password contained username. Default password created: \"password\"");
            this.password = "password";
        }else {
            this.password = password;
        }
        personalUrl = "facebook.com/" + this.username;
        posts = new ArrayList<>();
    }
    public Facebook(String username, String password, String fullName){
        this(username,password);
        for(Character letter: fullName.toCharArray()){
            if(!Character.isLetter(letter) && letter != ' '){
                System.out.println("Invalid name");
                this.fullName = "no name";
                return;
            }
        }
        this.fullName = fullName;
    }
    public Facebook(String username, String password, String fullName, int age, int numberOfFriends){
        this(username, password, fullName);
        if(age >= 0){
            this.age = age;
        } else {
            System.out.println("Invalid age");
            this.age = 0;
        }
        if(numberOfFriends >= 0 && numberOfFriends <= 5000){
            this.numOfFriends = numberOfFriends;
        } else {
            System.out.println("Invalid number of friends");
            this.numOfFriends = 0;
        }

    }

    public int getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(int numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getNumOfFriends() {
        return numOfFriends;
    }
    public void setNumOfFriends(int numOfFriends) {
        this.numOfFriends = numOfFriends;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }
    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    @Override
    public void directMessaging(String username, String message) {
        System.out.println(message + " sent to " + username);
    }


    @Override
    public void post(Object body) {
        posts.add(new Post((String) body));
    }

    @Override
    public void notification() {
        int currentTime = LocalTime.now().getHour();
        if(currentTime >= 8 && currentTime <= 17){
            System.out.println("Notification");
        } else {
            System.out.println("Sleep mode");
        }
    }

    @Override
    public String toString() {
        return "Facebook{" +
                "age=" + age +
                ", numOfFriends=" + numOfFriends +
                ", posts=" + posts +
                ", personalUrl='" + personalUrl + '\'' +
                ", accountLength=" + accountLength +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    @Override
    public void joinGroup(String group) {
        System.out.println(this.username + "has joined " + group);
        this.numberOfGroups++;
    }

    @Override
    public void leaveGroup(String group) {
        System.out.println(this.username + " has left " + group);
        this.numberOfGroups--;
    }

    public boolean sendFriendRequest(Facebook friend){
        if(friend.numOfFriends >= 5000) {
            System.out.println(friend.username + " can not accept any more friend request");
            return false;
        }
        if(this.numOfFriends < 5000) {
            System.out.println("Friend request sent to " + friend.username);
            this.numOfFriends++;
            return true;
        } else{
            System.out.println("You have reached the limit of friends");
            return false;
        }
    }
}
