package Social_Media_Task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
    private String body;
    private final String dateTime;

    public Post(String body) {
        this.dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a"));
        this.body = body;
    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDateTime() {
        return dateTime;
    }
}
