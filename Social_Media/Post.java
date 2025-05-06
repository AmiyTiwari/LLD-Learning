import java.time.LocalDateTime;
import java.util.*;

public class Post {
    private LocalDateTime time;
    private User user;
    private UUID id;
    private String content;

    public Post(UUID id, LocalDateTime time, User user, String content) {
        this.id = id;
        this.time = time;
        this.content = content;
        this.user = user;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public User getUser() {
        return user;
    }

    public UUID getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
