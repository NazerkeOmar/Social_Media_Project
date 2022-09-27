package Social_Media_Task;

import java.time.LocalTime;
import java.util.ArrayList;

public class Instagram extends SocialMedia implements HasPictures{

    private int numberOfFollowers;
    private int numberOfFollowings;
    private ArrayList<Picture> pictures;

    public Instagram(String username, String password) {
        this.platform = "Instagram";
        this.username = username;
        this.password = password;
        this.personalUrl = "Instagram.com/" +this.username;
        pictures = new ArrayList<>();
    }

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public void setNumberOfFollowers(int numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

    public int getNumberOfFollowings() {
        return numberOfFollowings;
    }

    public void setNumberOfFollowings(int numberOfFollowings) {
        this.numberOfFollowings = numberOfFollowings;
    }

    public ArrayList<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(ArrayList<Picture> pictures) {
        this.pictures = pictures;
    }

    @Override
    public void directMessaging(String username, String message) {
        System.out.println(message + " sent to " + username);
    }

    @Override
    public void post(Object body) {
        this.pictures.add((Picture)body);
    }

    @Override
    public void notification() {
        int currentTime = LocalTime.now().getHour();
        if(currentTime >= 10 && currentTime <= 10){
            System.out.println("Notification");
        } else {
            System.out.println("Sleep mode");
        }
    }

    @Override
    public void likePicture() {
        System.out.println(this.username + " likes the picture");
    }

    @Override
    public void unLikePicture() {
        System.out.println(this.username + " unliked the picture");
    }

    @Override
    public void sharePicture() {
        System.out.println(this.username + " sharing the picture");
    }

    @Override
    public String toString() {
        return "Instagram{" +
                "numberOfFollowers=" + numberOfFollowers +
                ", numberOfFollowings=" + numberOfFollowings +
                ", pictures=" + pictures +
                ", personalUrl='" + personalUrl + '\'' +
                ", accountLength=" + accountLength +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
