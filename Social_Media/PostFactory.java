import java.time.LocalDateTime;
import java.util.UUID;

public class PostFactory {
    public Post createTextPost(UUID id, LocalDateTime time, User user, String content) {
        return new TextPost(id, time, user, content);
    }
}