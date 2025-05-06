import java.time.LocalDateTime;
import java.util.UUID;

public class TextPost extends Post {
    public TextPost(UUID id, LocalDateTime time, User user, String content) {
        super(id, time, user, content);
    }
}
